/*
 * =>232page =>메소드
 * 		모든 프로그램: 데이터 + 메소드
 * 					------------
 * 		=>2005 =>스프링 활성화
 *				-----6개월 
 *		프레임워크 : 직접개발
 *		------------------------
 * 	메소드 
 * 		역할
 * 			1) 클래스와 클래스의 연결 (통신) =>메세지 
 * 			   매개변수(주고) 리턴형(받고)
 * 			2) 반복 제거
 * 			3) 구조적인 프로그램 
 * 			   절차적언어 ===>헌책방
 * 			   객체지향 ==>교보서적
 * 			   -----------------
 * 
 * 			4) 메소드는 호출시마다 {부터 }까지 ....=>호출한 위치로 원상복귀
 * 			5) 구성요소
 * 				주고받기 
 * 				--- --- 
 * 				|	 |=>리턴형
 * 				=>매개변수
 * 				매개변수	
 * 				  사용자 요청한 => 여러개,1개,없을수도있음
 * 								------------------
 * 								=>최소화:3개이상 / 클래스 /배열
 * 				리턴형 : 사용자 요청에 대한 처리 결과값
 * 						=>1개만 사용 가능
 * 						=>데이터값 여러개 : 배열 /클래스
 * 				메소드명 => 구분자 => 소문자로 시작=>식별자
 * 						약간의 의미
 * 						-------- 5~10
 * 						 aaa() boardInsert()
 * 						 bbb() join()
 * 
 * 				구현부
 * 				{
 * 					return; void=>생략이 가능=>컴파일시에 자동 추가
 * 					return 값
 * 				}
 * 				1. return
 * 				2. 생성자
 * 				3. import java.lang 은 생략하더라 슈퍼클래스
 * 				4. 모든 클래스 => 상속 object
 * 				class A
 * 				{
 * 					int a;
 * 					String name;
 * 					A(int a,String n)
 * 					{
 * 						this.a=a;
 * 						name=n;
 * 					}
 * 				}
 * 				A aa= new A(10,"aaa");
 * 				A bb= new A(10,"bbb");
 * 			=형식)
 * 				 public   static/abstract
 * 				[접근지정어][제어어]리턴형 메소드명 (매개변수....)
 * 				{
 * 					구현
 * 					return 결과값
 * 				}
 * 
 * 
 * 
 */
class Methods
{
	
	int a=10;//new써야만사용가능
	String name="홍길동";//new써야만사용가능
	static int b=20;// 컴파일시에 저장 new를안써도 사용가능
	static void display()//컴파일시에 저장 new를안써도 사용가능 
	{
		System.out.println("Common Method");
	}
	void display(int a) {
		System.out.println("Instance Method");
	//클래스이름을써서들어가면 스태틱 객체이름을써서들어가면 인스턴스
	}
}


public class 메소드_1 {

	public static void main(String[] args) {
		
			System.out.println("b="+Methods.b);
			Methods.display();
			//목록 =>한번 저장
			Methods m=new Methods();
			m.display(100);
			System.out.println("a="+m.a);
	}

}
