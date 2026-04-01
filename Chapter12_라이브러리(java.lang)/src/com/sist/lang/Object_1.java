 package com.sist.lang;
/*
 *  자바에서 지원하는 클래스 집합 :라이브러리
 * 	=라이브러리
 * 		1) 자바에서 지원
 * 		2) 외부 라이브러리 =>자바 개발업체/오픈 소스
 * 			=>mvnrepository.com
 * 			=>lombok.jar/jsoup.jar
 * 			=>spring..(오픈소스그룹의 라이브러리) 
 * 		-------------------------- + 사용자 정의 클래스=>조립
 * 		= java.lang
 * 			=> 자바에서 많이 사용되는 클래스의 집합
 * 			=> import를 생략할 수 있다
 * 			=> Object : 모든 클래스의 상속 내리는 최상위 클래스
 * 				=> 모든클래스에는 extends Object 를 상속하고있다
 * 				=> 모든 데이터형 / 모든 클래스를 관리할 수 있다.
 * 					예)
 * 						Object o=10;
 * 						o=10.5;
 * 						o=true;
 * 						o="";
 * 						o='a';
 * 						o=new A();
 * 						----------라이브러리에서 지원 메소드
 * 								  메소드 단점:리턴형: Object=> 형변환
 * 										   매개변수:Object
 * 								  => 제네릭:오브젝트를 내가원하는데이터형으로 바꿔서 사용하는거
 * 			=> 주요 메소드
 * 				**1. finalize() :객체 소멸 => 자동 호출
 * 				**2. clone() : 복제 => 값이 있는 그대로 복사 후 새로운 메모리에 저장
 * 				**3. equals() : 객체 비교 
 * 				**4. hashCode() : 객체마다의 고유 식별자
 * 				5. getClass() : 리플렉션 => 객체 생성할 때 객체의 정보를 얻기
 * 			= String : 문자열 관리 클래스
 * 			= StringBuffer / String Builder
 * 			= Math : 수학 관련
 * 			= System : 입출력 / 가비지 컬렉션
 * 			= Wrapper : 데이터형 쉽게 관리 => 클래스
 * 			  int => Integer,dobule=>Double
 * 			= Thread : 동시성 => 네트워크 => 애플리케이션 개발
 * 						웹 : Ajax => Vue / React
 * 						     Axios
 * 		= java.util
 * 			= Date / Calendar / Time
 * 			= StringTokenizer => 문자열을 자를 때
 * 			= Scanner
 * 			= List / Set / Map
 * 		= java.text
 * 			= DecimalFormat => 1,000
 * 			= SimpleDateFormat => 2026-03-30
 * 			= ChoiceFormat => switch를 대체
 * 			= MessageFormat => 출력 형식 => 출력 (SQL)
 * 		---------- 응용 => 예외처리
 * 		= java.net
 * 			= 네트워크
 * 			= URL/ Socket / ServerSocket
 * 		= java.io
 * 			= File 관련
 * 		= java.sql
 * 			= 데이터 베이스
 * 			= Connection / Statement / ResultSet
 * 			
 * 		--------------------------- javax(jakarata).http.servlet
 * 									웹서버:tomcat 9=>javax
 * 											=>spring =>sts3.9
 * 										  tomcat 10이상=>jakarata
 * 											=>sts 4.x=>jakarata
 * 
 * 
 * 		1. 람다 : 함수 포인터 => 소스 간결하게 만들 때 사용
 * 			람다스트림 : 16 , 17
 * 			=> JWT / Spring 보안
 * 			=> 데이터베이스 간단하게 출력할 때 쓰는
 * 		2. 제네릭 : 데이터형 통일화 => 형변환 없이 사용이 쉽게 만드는 
 * 			=> 컬렉션 클래스가 모였을때 => 컬렉션의 역할 : 클래스를 모아서 관리하는역할
 * 		3. 어노테이션 : 인덱스 => 검색과 관련
 * 			=> 메소드 / 클래스 / 멤버변수 를 찾을 때 
 * 			=> Spring 쪽에서 일어나는곳
 * 		4. 리플렉션 : new 없이 클래스면으로 메모리 할당
 * 			=> Spring
 * 		5. 정규식 : 크롤링 ( 검색 ) 과 관련 => 패턴으로 문자열을 찾는 경우
 *		   ---------------------------------------------------
 *			파일 => txt , csv , json
 *							   -----**** 자바에서 데이터를 모아서 => Vue/React
 *		1권 : 문법사항
 *			  변수/연산자/제어문/반복문
 *			  메소드
 *			  클래스
 *			  클래스 생성 : 개체
 *			  클래스 종류 ( 추상클래스 / 인터페이스 )
 *			  예외처리 
 *			  형식 / 문법
 *			  -------------------------------
 *		2권 : 실제 프로그램 개발
 *				= 네트워크 : 흐름 파악 (C/S) => Client/Server (웹 페이지)
 *				= 데이터베이스 : 웹
 *
 *		12장 => 라이브러리 클래스 
 *
 *
 *
 *
 *	499 Page
 *  -----------
 *   Object 클래스 : 모든 클래스의 상위 클래스
 *   	=>extends Object => java.lang.Object
 *   						----------------
 *   						|Syste/String/Number/StringBuffer/ Thread
 *   
 *   1. 개체 생성~ 소멸 담당하는 클래스
 *   	new 	finalize() : 소멸자 메소드
 *   			=> 메모리에서 해제 
 *   2. 복제 / 비교 
 *   3. 문자열
 *   
 *   
 */
 // finallize()
 class Sawon
 {

	 private String name;
	 private String dept;
	 public Sawon(String name,String dept){
		 this.name=name;
		 this.dept=dept;
		 //this => Sawon 클래스 자신의 객체
		 // 구분 : 매개변수 / 인스턴스 변수 구분
		 // this는 static으로 되있어서 => 모든 클래스에 대입이 된다
		 // this는 new 늘 이용해서 객 생성이 될때 주소값을 대입
		 // 변수 충돌이 없는 경우 => this. 생략이 가능
	 }
	 public void print()
	 {
		 System.out.println("이름 : "+name);
		 System.out.println("부서 : "+dept);
		 /*
		  * this 사용처
		  *   this는 클래스{블록}안에서만 사용이 가능
		  *   =>생성자
		  *   =>인스턴스 메소드에서만 사용이 간으 
		  *   => 인스턴스 초기화 블록 / static{블록} / static 메소드에서는 사용이 안 됨
		  */
		 

	 }
	 

	 @Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
		 System.out.println("객체 메모리 해제");
			super.finalize();
			/*		1.설계			2.객체 생성	3.객체 활용
			 *   class 제작 === new 생성자 () === 객체.메소드()
			 *   									| 4. 객체 소멸
			 *   								객체=null
			 *   									| ---finalize
			 *   								GC()에 의해 해제
			 * 
			 * 
			 */
		} 
 }
	 
	 
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		 Sawon sa = new Sawon("홍길동","개발부");
		 //객체 활용
		 sa.print();
		 //객체 소멸
		 sa=null;
		 // 자동으로 gc=> 수거 => 메모리가 많은 상태 => 종료 후에 나중에 회수
		 // finalize가 호출
		 // 바로 해제 => 자동 메모리 해제
		 
		 System.gc();
		 // Object : 객체 생성 ~ 객체 소멸
		 
	}

}
