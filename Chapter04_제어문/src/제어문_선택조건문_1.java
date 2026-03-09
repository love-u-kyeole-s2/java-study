import java.util.Scanner;
//프로그램에서는 제일 많이 사용되는 조건문
// => 조건 true/false
/*	  단일 조건문은 => true 수행
 * 					false 건너뛴다
 * => 선택 조건문
 * 	  true =>처리
 * 	  false =>처리
 * 
 * 		형식)
 * 			if(조건문)
 * 				{
 * 					조건 true 일 때 => 짝수, 로그인,아이디중복
 * 				}
 * 			else
 * 				{
 * 					조건 false일 때 => 홀수, 로그아웃,아이디 중복 없음
 * 				}
 * 
 */
import java.util.Random;
public class 제어문_선택조건문_1 {
	public static void main(String[] args) {
		
		//admin /1234
		Scanner scan=new Scanner(System.in);
		System.out.println("ID 입력");
		String id=scan.next();
		
		System.out.println("비밀번호 입력");
		String pwd=scan.next();
		
		if(id.equals("admin")&&pwd.equals("1234")) 
		{
			System.out.println("로그인되었습니다!!");
		}
		else
		{
			System.out.println("ID나 Password가 틀립니다!"); // ==쓰게되면 틀렸다나옴 문자열은 꼭 eqauls 써주셈
			

		}
		
		Random r=new Random();
		int i = r.nextInt(100)+1;
		System.out.println("정수값:"+i);		
		if(i%2==0)
			System.out.println(i+"는 짝수입니다");
		if(i%2!=0)
			System.out.println(i+"는 홀수입니다");	
		char c='A';
		if(c>='A'&&c<='Z')
			System.out.println(c+"는 대문자입니다.");
		else
			System.out.println(c+"는 소문자입니다.  ");
	}

}
