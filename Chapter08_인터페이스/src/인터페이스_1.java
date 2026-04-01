/*
 * 	인터페이스
 * 	1.기능(메소드)정해둔다
 * 		=>모든 개발자 동일한 메소드를 구현=> 표준화
 * 				   ----------분석
 * 	2. 인터페이스 사용?
 * 	   1)이미 어떤 걸 구현해야 되는지 알고 있다 (규격화)
 * 	   2) 여러 개발자 동시 개발
 * 		=>이 기능은 반드시 구현
 * 		  -----
 * 		  1. 웹
 * 			---
 * 			1)main
 * 			2)게시판
 * 			3)공지사항 :관리자모드
 * 			4)회원가입=로그인
 * 			=>메뉴얼=>인터페이스
 * 		3)내부구현이 발현
 * 
 * 
 * 
 * 클래스는 접근지정어 선택적
 * 인터페이스 접근지정어 => 필수 (public)
 *				추상클래스			/인터페이스=>무엇을해야하는지 알려준다=>완전한 미완성 클래스
 * 				ㄴ기본은 만들어준다  /나머지 개발자에게 맡긴다
 * 				---------------
 * 				버튼 
 * 				=>객체 생성이 안된다( new(x))
 * 				=>상속=>구현해서 사용이 가능
 * 
 * 
 * 								인터페이스				추상클래스(면접98%)
 * -----------------------------------------------------------------------------
 * 		개념					설계중심					기본+규칙(재사용중심)
 * 							규칙
 * 		구현코드				거의 없다					실제 구현+구현 없음
 * 							선언만
 * 							=>경우수가 많은 경우
 * 		상속					다중상속					단일상속
 * 		사용목적				강제/수정 유연성			공통기능 재사용
 * -----------------------------------------------------------------------------
 * =>기능 설정 => 개발시간 단축
 * 	 ------- 소스가 통일화
 * =>상속받을때 쓰는거 			implements 				extends
 * ** 최근에 추가된 메소드 인터페이스도 구현된 메소드가 가능
 * 								----------default/static
 * ** 인터페이스는 모든 요소가 public 이다
 * 		**변수는 상수형만 사용이가능하다
 * 			   ----- 반드시 초기값을 설정해야한다.
 * 	**public 
 * 		1) 다른 클래스와 통신
 * 		2) 어떤 위치든 접근이 가능
 * 			public 없는 경우에는 자동으로 public 을 추가해준다
 * 	**사용처
 * 		1) 윈도우의 이벤트 처리
 * 		  JButton/JTextField/MouseClick ...
 * 		  =>interface
 * 		2) 결합성이 낮은 프로그램: 스프링
 * 		3) 여러개 있는 경우=>인터페이스
 * 
 */
import java.util.*;
interface I
{
	public int a=10;
	void display();
	default void aaa() {
	
	}//인터페이스는 public없음 에러난다
}
interface II
{
	void display();
	default void aaa() {}; //선택적 오버라이딩
}
class A implements II
{
	public void display() {};
}
class C implements II
{
	public void display() {}
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new Vector<String>();

		list.add("홍길동");
		list.add("이순신");
		list.add("심청이");
		for(String name:list)
		{
			System.out.println(name);
		}

	}

}
