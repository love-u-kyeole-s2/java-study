/*
 * 	선택문=> 다중 조건문을 단순화
 * 			복잡한 소스코딩에서 주로 사용
 * 			-------------게임/네트워크
 * 
 * 		switch(정수/문자/문자열)====>boolean / double(X)
 * 		{
 * 			case "+" ->처리문장; 자동으로 break break를 생략한다
 * 			case "-" ->처리문장;
 * 			.
 * 			.
 * 			.
 * 			default : 처리 ===> else
 * 		}
 * 
 */
import java.util.Scanner;
public class 제어문_선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		//2. 연산자
		System.out.println("연산자 입력 (+,-,*,/)");
		String op=scan.next();
		//자바에서 입력하는 모든 장치 char(x)=>String
		// 3. 두번째 숫자=>저장 =>결과값 출력시 읽기
		// Scanner 단점은 엔터 공백
		// aaa bbb ccc => enter 결과값은 aaa=>next()
		//=> nextLine())
		// 웹 /윈도우(입력창)
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();

		switch(op)
		{
		case "+"->{
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		System.out.println("프로그램 종료"
				+ "");}
		case "-"->
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		case "*"->
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		case "/"->
			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
		default-> System.out.println("없는 연산자입니다.");
		}

	}

}
