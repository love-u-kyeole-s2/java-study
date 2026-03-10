/*
 * 	프로그램
 * 		=> 반복문(조건,선택문)
 * 	형식
 * 		1) 제어문의 형식
 * 			1.조건식
 * 				단일		|---------------true/false 연산만사용
 * 					  if(조건문)---------------------부정연산자(!),비교연산자,논리연산자
 * 						{
 * 							실행문장==> 조건 true일 때 처리
 * 						}
 * 						=>for 안에 if 사용 =>검색
 * 				선택
 * 					if(조건문)
 * 					{
 * 						조건이 true
 * 					}
 * 					else
 * 					{
 * 						조건이 false
 * 					}
 * 				선택문
 * 					switch(문자,문자열,정수)
 * 							   -----
 * 					{
 * 						case 값:
 * 								처리문장
 * 								break
 * 						..
 * 						..
 * 						default:처리문장 =>break를 생략이 가능
 * 					switch(문자 문자열 정수)
 * 					{ 
 * 						case 값->처리문장;
 * 						..
 * 						default->처리문장;=>반드시추가해야한다
 * 					}----- break를 사용하지 않는다
 * 
 * 					반복문 for/while/do~while/break/continue
 * 
 * 					for: 반복 횟수가 지정된경우
					---
								 1 -> 2	<---4|-----------
							for(초기값;조건문;증가식)		|
							{			|				|
 * 										|				|
 * 									실행문장 3-------------
 * 							} 정수 /문자
 * 							1. 초기값 int i=1;
 * 							2. 조건검사 i<=10 true->문장수행
 * 											false 종료
 * 							3. i를 증가=> i=2 ==>i<=10
 * 							초기값 : 시작 위치 값
 * 							조건문 : 어디까지
 * 							증가식 : 몇번....
 * 
 * 자바 반복문 문제
1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.
3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.
4. 1~100 사이에서 7의 배수 개수를 구하시오

5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
6. 1부터 10까지 숫자를 while문으로 출력하시오.
7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
8. 1~100 사이 홀수만 출력하시오.
9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
10. 숫자 10부터 1까지 역순 출력하시오.

 * 
 */
import java.util.Scanner;
public class 테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1부터 100까지 숫자 중 짝수의 합을 구하는 프로그램을 작성하시오.
		int sum=0;
		for(int i=0;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("1부터 100까지 숫자 중 짝수의 합:"+sum);
		
//		2. 사용자에게 숫자 n을 입력받아 1부터 n까지 합을 구하시오.

		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int n=scan.nextInt();
		
		int sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum2+=i;
		}
		System.out.println("1부터 "+n+"까지 숫자 중 짝수의 합:"+sum2);

//3. 1부터 50까지 숫자 중 3의 배수만 출력하시오.
		for(int i=1;i<=50;i++) {
			if(i%3==0) 
			{
				System.out.print(i+" ");

			}
		}
		System.out.println();

//4. 1~100 사이에서 7의 배수 개수를 구하시오
		int n7=0;
		for (int i=1;i<=100;i++)
		{
			if(i%7==0)
				n7+=1;
		}
		System.out.println("1~100사이에 7의 배수의 개수: "+n7);
	
	//5. 문자열 "JavaProgramming" 의 각 문자 하나씩 출력하시오
	String str="JavaProgramming"; 

	for (int i=0;i<str.length();i++)
	{
		System.out.print(str.charAt(i)+" ");
	}
	
	System.out.println();

//	6. 1부터 10까지 숫자를 while문으로 출력하시오.
	int num=1;
	while(num<=10) 
	{
		System.out.print(num+" ");
		num++;
	}
	System.out.println();

//	7. 사용자에게 숫자를 입력받아 1부터 그 숫자까지 출력하시오.
	System.out.println("숫자를 입력하시오");
	int n2=scan.nextInt();
	for(int i=1;i<=n2;i++)
	{
		System.out.print(i+" ");
	}

	System.out.println();

//	8. 1~100 사이 홀수만 출력하시오.
	for(int i=1;i<=100;i+=2)
	{
		System.out.print(i+" ");
	}
	System.out.println();
//	9. 1~100 사이 숫자 중 5의 배수 합을 구하시오.
	int sum3=0;
	for(int i=1;i<=100;i++)
	{
		if(i%5==0)
			sum3+=i;
	}
	System.out.println(sum3);
	

//	10. 숫자 10부터 1까지 역순 출력하시오.
	for(int i=10;i>=0;i--)
	{
		System.out.print(i+" ");
	}

}
}
