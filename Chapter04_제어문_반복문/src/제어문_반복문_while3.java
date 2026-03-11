/*
 * 
 * 
 * 	1~100 사이의 총합/짝수합/총수합
 * 	=>
 * 	1~100까지 변경 =>루프변수
 * 	총합/홀수합/짝수합
 * 	========> 변수 
 * 
 */
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0,even=0,odd=0;
		while(i<=100)
		{
			//처리문장
			sum+=i;
			if(i%2==0) 
				even+=i;
			else
				odd+=i;
			i++;
		}
	
		System.out.println("1~100까지 총합 : "+sum);
		System.out.println("1~ 100까지 짝수합 : "+even);
		System.out.println("1~100까지 홀수합:"+odd);

	}

}
