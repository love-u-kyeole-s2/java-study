package com.sist.regex;
/*
 * 뭘 잘기억해야되냐면
 * 	정규표현식 : 특수 기호를 활용한 복잡한 문자 패턴을 효율적으로 매칭하는 방법
 * 			 -관련된 데이터 검색 (검색용
 * 			 -------------웹=>다중검색
 * 	리플렉션 : 클래스의 정보에 접근해서 동적으로 제어하는 기술
 * 			 => 객체 생성 가능 / 변수값 주입 / 메소드 호출 / 생성자 호출 제어할 때 쓴다.
 * 			 => 클래스 명으로 접근이 가능하다.
 * 			 => 보안 ( private ) , 속도 저하  
 * 			 => 결합성이 낮아진다 (new)
 * 			  				  ----라이브러라를 사용하기 때문에 뉴를 사용할 수 없다.
 * 	어노테이션 : 구분자를 달아서 찾기 쉽게 만든다. 
 * 			  자동화 처리
 * 	프로그램
 * 		=> 추가, 삭제 수정 상관없이 => 자동화처리 하기위해 어노테이션 리플렉션 쓴다. 장점:서버수정없이 기능만 추가
 * 	정규식
 * 	----------
 * 	1. 임의의 한문자 => .
 * 	   ----------알파벳/한글/특수문자
 * 
 */
public class 정규식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("hkkllo".matches("h..llo"));
		System.out.println("h#llo".matches("h.llo"));
		System.out.println("hello".matches("....."));
		System.out.println("홍길동".matches("홍.."));
		System.out.println("맛있고".matches("맛있."));
		// 빅데이터 => AI
		// 데이터수집 => 데이터 분석 => 시각화 => 예측( AI )


	}

}
