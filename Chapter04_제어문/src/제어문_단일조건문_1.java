/*
 *  알파벳을 입력을 받아서 대문자 /소문자
 * 
 * 	if(조건문)
 * 	{
 * 		실행문장=> 조건 true 일 때 수행하는 문장
 * 	}
 * 	난수 3개 발생
 * 	---컴퓨터에서 임의로 추출하는 값
 * 	최댓값 / 최소값 =>if
 * 
 * 	난수
 * 		Math.random*()=>0.0~0.99
 * 						--------*100
 * 						0.0~99.0 =>정수 변환 0~99
 * 		Random r=new Random()
 * 		r.nextint(100)+1
 */
import java.util.Scanner;
import java.util.Random;
public class 제어문_단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 입력: ");
		// => 문자 입력은 불가능 =>문자열 => 문자형으로 변환
		String ch=scan.next();
		/*
		 *	입력
		 * 		=nextInt() =>정수
		 * 		=next() =>문자열
		 * 		=nextDouble() =>실수
		 * 
		 * 		ABCDEFG
		 * 		0123456
		 * 
		 */
		char c=ch.charAt(0);
		System.out.println("알파벳: "+c);
		
		if(c>='A'&&c<'Z')
			System.out.println(c+"는(은) 대문자입니다.");
		if(c>='a'&&c<'z')
			System.out.println(c+"는(은) 소문자입니다.");
		if(c>='0'&&c<='9')
			System.out.println(c+"는(은) 숫자입니다.");
		
		String id="admin";
		String pwd="1234";
		
		if(id.equals("admin")&&pwd.equals("1234"))
		{
			System.out.println("로그인되었습니다");
		}
		if(!(id.equals("admin")&&pwd.equals("1234")))
		{
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}
		
		Random r = new Random();
				// new: 동적 메모리 할당 => heap영역에 저장 => 클래스를 저장할 때 사용
				// 객체지향
				int num1=r.nextInt(100)+1;
				//			00~99=>+1=>1~100
				int num2=r.nextInt(100)+1;
				int num3=r.nextInt(100)+1;
				//{}같은 블록에서 변수명이 동일하면 안된다
				/*
				 *  변수=>반드시 초기값 설정
				 * 	초기값
				 * 		1. 명시적 초기값
				 * 		   int a=10;
				 * 		2. 입력을 받아서 저장 Scanner
				 * 		3.컴퓨터가 임의의 설정 ==> random
				 * 		***4.파일 읽기 / 오라클 읽기
				 */
				System.out.println(num1+","+num2+","+num3);
				
				int max=num1;
				if(max<num2)
					max=num2;
				if(max<num3)
					max=num3;
				System.out.println("최대값:"+max);
				int min=num1;
				if(min>num2)
					min=num2;
				if(min>num3)
					min=num3;
				System.out.println("최소값"+min);
				int middle=num1+num2+num3-max-min;
				System.out.println("중간값: "+middle);
	}		

}
