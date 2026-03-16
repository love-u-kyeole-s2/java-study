/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  2. 리턴형은 한개만 사용이 가능
 *  		여러개인 경우=====>배열 클래스
 *  
 *  3.매개변수는 여러개 사용이 가능 
 *  	=>배열/클래스 이용이 편리
 *  		  ----
 *  		  |회원가입
 *--------------------------------	
 * 문자 1개 입력-> 대문자:소문자, 소문자->대문자 변경
 * 				-----------------------
 * 				리컨형 char  
 * ----------매개변수 char
 * 5개의 정수 입력 => 가장 큰 값을 출력
 * ------------    -------------
 * |int[]		 	|int
 * 5개의 정수 입력 => 정렬한 데이터 출력
 * ------------	   -------------
 * |int[]			|int[] , void(자체)
 * => 자체 출력/ 결과값을 받아서 출력
 * ---------void-----------------
 *  
 * 5개 정수를 받아서(매개변수) int[]
 * 평균 /총점을 출력
 * -----------자체출력 할거냐 메소드2개할거냐=>자체=>void
 *  * 문자 1개 입력-> 대문자:소문자, 소문자->대문자 변경
 */

import java.util.Arrays;

public class 메소드_7 {
	//메소드 문자 1개 입력=> 대ㅐ문자:소문자 소문자:대문자 변경
	// 'A'65,'a'97==>32
//	static char change(char c)
//	{	//문자열 => toUpperCase()/toLowerCase()
//		return c>='A'&&c<='Z'?(char)(c+32):char(c-32);
//	}
	//5개의 정수 입력=> 가장 큰 값을 입력
	//------------입력값 3개 이상이면 보통 배열
	static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	static int min(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
	}
	//void 자체 안에서 출력한다
	static void sort(int[] arr,String type)
	{
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++)
			{
				boolean b=false;
				if(type.equals("ASC"))
				{
					b=arr[i]>arr[j];
				}
				else
				{
					b=arr[i]<arr[j];
				}

				if(b)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
	}
	static void gesan(int[] arr)
	{
		int sum=0;
		double avg=0.0;
//		for (int i=0;i<arr.length;i++)
//		{
//			sum+=arr[i];
//		} 실제 데이터 이용
		for(int i:arr) 
		{
			sum+=i;
		}
		avg=sum/(double)arr.length;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c='B';
//		char res=change(c);
//		System.out.println(res);
		int[] arr=new int[5];
				for(int i=0;i<arr.length;i++)
				{
					arr[i]=(int)(Math.random()*100)+1;
				}
		//메소드 호출 후 결과값 받기
		int m=max(arr);
		//배열=>배열명 설정
		System.out.println(Arrays.toString(arr));
		System.out.println("최대값은"+m+"입니다");
		
		m=min(arr);
		//배열=>배열명 설정
		System.out.println("최소값은"+m+"입니다");
		
		// * 5개의 정수 입력 => 정렬한 데이터 출력

		sort(arr,"ASC");
		sort(arr,"Desc");//void는 받는값이없다=>메소드 호출만 가능
		gesan(arr);
	}

}
