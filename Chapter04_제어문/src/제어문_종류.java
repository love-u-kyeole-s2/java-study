/*
 * 
 *	건너뛴다/반복 수행/선택/반복제어 
 *------------------------------
 *	제어문 (연산자 활용)
 *		=>평문
 *		  한줄씩 소스코딩
 *		=>조건문
 *		=>반복문
 *		=>한문장만 수행이 가능
 *		if(조건)
 *			문장 1=>if문 소속
 *			문장 2 별도의 문장
 *		if문에 문장 2개 넣고싶을 때
 *		if(조건){
 *			문장1
 *			문장2
 *		}=>여러개 조건을 동시에 수행
 *		
 *
 *	조건문=> 에러처리/ 필요한 부분만 출력하는 용도에 많이 쓰임 
 *		=단일 조건문
 *		형식)
 *				┌조건에 들어갈수 있는것 :부정연산자/비교연산자/논리 연산자만 사용이 가능
 *			if(조건)----------------------------true/false
 *			{								   ㄴ수행 ㄴ건너뛴다
 *				수행문장
 *			}
 *			=>여러개 사용이 가능
 *			=>한 개 씩 조건을 비교==>속도가 늦다
 *			=> 사용 : 유효성 검사/메뉴 처리
 *			=> 웹에서 게임 
 *			=> 자바 =>backend
 *						=>프로그램언어
 *						=>JSP
 *						=>Spring
 *						=>Oracle
 *					 frontend
 *						=>HTML/CSS/JS
 *								  ----
 *									ㄴ 라이브러리 :Jquery
 *												Vue
 *												React
 *						=>JS =>데이터형이 다르다 :통일
 *						  int a=10
 *						  --------
 *						  let a=10
 *							  a=10.5=>TypeScript
 *									=>NodeJS
 *						  --------SI/SE=>devOps =>CI/CD
 *												  -----
 *													ㄴ 운영체제에 따라 다르다
 *													ㄴ docker
 *													   aws
 *		=선택 조건문
 *		=다중 조건문
 *	선택문
 *		=선택문
 *	반복문
 *		=do~while
 *		=while
 *		=for
 *	반복제어문
 *		=break
 *		=continue 
 * 
 */
// 입력 => 1. 짝수/홀수 => 중요한점: 조건처리하는거 잘이해하기
// 코딩순서: package =>import => class
import java.util.Scanner;
public class 제어문_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("정수 입력:");
		//엔터=>메모리에 저장
		int num=scan.nextInt();
		//입력된 정수 읽기
		if(num%2==0) //짝수냐 =>업데이트 할 수 있기때문에 괄호는 여닫는 걸 주의
		{
			System.out.println(num+"는(은) 짝수입니다.");//조건이 true일때만 문장을 수행하는 공간
		}
		if(num%2!=0) // 홀수냐 num==1 도 됨
		{
			System.out.println(num+"는(은) 홀수입니다.");//조건이 true일때만 문장을 수행하는 공간
		}
	
		
	}

}
