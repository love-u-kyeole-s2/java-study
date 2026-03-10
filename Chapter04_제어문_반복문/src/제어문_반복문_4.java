/*
 *  1~100까지 정수 중에 3의 배수/5의 배수/7의 배수 갯수
 *  				--------------------------
 *  				단일 조건문=>중복처리 가능
 *  				15 =>3,5
 *  				21 =>3,7
 *  				35 =>5,7
 * 
 * 
 */
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;

		/*
		 * 유형이 같은 변수=>데이터형이 동일
		 * 	int a,b,c;
		 * 	a=b=c=0;
		 * 	int a=0,b=0,c=0;
		 * 
		 */
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
				a3++;
			if(i%5==0)
				a5++;
			if(i%7==0)
				a7++;
		}
		//갯수확인 ++ 누적+=
		System.out.println("1~100 사이의 3의 배수의 갯수: "+a3);
		System.out.println("1~100 사이의 5의 배수의 갯수: "+a5);
		System.out.println("1~100 사이의 7의 배수의 갯수: "+a7);
//1. 변수, 반복문, 결과값
		//1. 1~100사이의 짝수합 홀수합
		int odd=0;
		int even=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) 
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
			
		}
		System.out.println("1~100 사이의 홀수의 합 :"+odd);
		System.out.println("1~100 사이의 짝수의 합: "+even);

		
	}

}
