/*
 * 1.단일 조건문
 * 	if(조건문)
 * 		{
 * 				
 * 		}
 * 
 * 2.선택조건문
 *   	if(조건문)
 * 		{
 * 			조건이 true 일 때	
 * 		} 
 * 		else
 * 		{
 * 			조건이 false 일 때
 * 		}
 * 3. 다중조건문
 *   	if(조건문)
 * 		{
 * 			조건이 true 일 때	
 * 		} 
 * 		else if(조건문)
 * 		{
 * 			조건이 false 일 때
 * 		}else if(조건문)
 * 		{
 * 
 * 		}
 * 		else
 * 		{
 * 
 * 		}
 * 
 */

import java.util.Scanner;
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		
		System.out.print("연산자입력(+,-,*,/):");
		String op=scan.next();
		
		System.out.print("첫번째 정수 입력:");
		int num2=scan.nextInt();
		
		char c=op.charAt(num2)
				
		if(c=='+')
		{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(c=='-')
		{
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);

		}
		else if(c=='*')
		{
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);

		}
		else if(c=='/')
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			}
		}
		else {
				System.out.println("잘못된 연산자입니다.")
		}
		}
		
	}

}
