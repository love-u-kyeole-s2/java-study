package com.sist.oop;
/*
 * 	접근지정어 / 제어자 
 * 	---------------
 * 		구분=>패키지=>안에있는 클래스 가지고오기 =>import
 * 	---------------
 * 	1.package: 한번만 사용
 * 	2.import=>여러번 사용이 가능
 * 	3.class
 * 	---------------
 *   |접근지정어 => public/default
 *  ---------------클래스 제작 순서
 *  4. 클래스 구조
 *     (public) class ClassName
 *     {
 *     	-------------
 *     	변수 =>private
 *     	-------------
 *     	생성자=> 다른 클래스와 연결=>public
 *      -------------
 *      메소드=> 다른 클래스와 통신=>public
 *      -------------
 *     }
 *     
 *     1)static/instance
 *     	-------------
 *      static 특징
 *      ------------- 공유 목적=>사이트(동일한 내용이 나온다)
 *      			  로그 / 공통 CSS
 *      			  객체 생성없이 사용이 가능
 *      =>컴파일시에 메모리 저장
 *      =>독립적으로 사용이 가능==>클래스.변수명/클래스.메소드()
 *      =>공유 멤버 변수 : 회사명,학교명 ...
 *        ------- 변경이 되면 모든 인스턴스 한번에 변경
 *        ------- 오라클 저장되는 데이터
 *      =>사용제한
 *        ------- static 메소드 안에서 static만 사용이 가능
 *        ------- 인스턴스를 사용
 *        		  반드시 new 이용해서 객체 생성 후에 사용이 가능
 *      => 사용 목적: 전역 변수
 *      2) instance변수
 *         객체 변수=> 따로 메모리를 만들어서 저장 후 사용
 *         			 맛집 : 300개
 *         => static/instance=>프로그램 종료시까지 메모리 유지
 *         => instance변수=>this.변수명
 *  	   => ***static은 this를 사용할 수 없다 
 *  	class A
 *  	{
 *  		int a,b;
 *  		static int c;//메모리 크기에서 제외
 *  	}
 *  	-------------------실제로 저장되는 메모리크기 :8byte
 *  	A aa=new A();
 *  	  aa ------->   -------		---c---
 *  					 --a--		   0
 *  					   0        -------
 *  					 -----
 *  					 --b--
 *  					   0
 *  					 -----
 *  					-------
 *  	int a,b;
 *  	static int c;
 *  	static void disp
 *  
 *  
 *  	void display(int a,int b)
 *  	{
 *  	}
 *  	void display()
 *  	{
 *  		System.out.println(this.a)
 *  						  구분할 변무명이 없는 경우 this.을 생략
 *  		System.out.println(this.b)
 *  		System.out.println(A.c)
 *  
 *  	오라클
 *  		A: no,name,subject,image
 *  		B: no,title,image,comment
 *  		
 *  		select A.no, name,subject,A.image,B.no,titke
 *  		from A,B
 *  2.생성자
 *  	=> 클래스를 저장해서=>객체를 생성시에 호출
 *  	   생성자 =>호출할때
 *  			  절대로 new를 앞에 붙인다 new 생성자();
 *  	=> 특징
 *  	   클래스명과 동일
 *  	   리턴형이 없다
 *  	   오버로딩 지원
 * 		   오버로딩
 * 			=>같은 이름의 메소드로 새로운 기능 제작
 * 			=>문법
 * 			  메소드명 동일
 * 			  매개변수의 개수가 
 * 
 * 		A(String n,int a)
 * 		{
 * 			this()=> 변수 초기화시 중복 제거
 * 			name=n;
 * 			age=a;
 * 		}
 *  }
 *  this()=>생성자 안에서 호출
 *  	  =>반드시 첫번째 줄
 *  	  =>생성자 안에서 다른 생성자 호출
 *  	  =>중복 코딩을 제거
 *  	  =>this=>매개변수/인스턴스 구분
 *  --------------------------------
 *   **this=>자신의 객체
 *   		 컴파일시 생성=>static
 *   		 모든 클래스가 가지고 있다
 *   	A a=new A()
 *   	this=a
 *   	A b=new A()
 *   	this=b
 *   	==>현재 사용하고있는 객체가  this
 *   	-------컴파일러에의해 처리
 *  --------------------------------
 *  *** static=>클래스 전체에서 공동으로 사용되는 변수 정의
 *  	this()=>생성자간의 연결을 통해서
 *  			효율적인 초기화 수행
 *  			------반복제거
 *  	this=>자신의 객체=>모든 클래스가 가지고 있다
 *  	**인스턴스 변수/인스턴스 메소드에서만 적용이된다
 *  --------------------------------                                                                                                                                                                                                                                                                                                                    
 * 	}
 * 프로그램
 * 	1. 기능 설정:메소드
 * 		=>메소드 안에서 공통으로 사용되는 변수
 * 								   -- 인스턴스 변수
 * 	2. 화면UI=>변수 초기화
 * 		=> 명시적 초기화 => 알고 있는 상태
 * 			=>목록 =>페이지 나눠짐
 * 		=> static블록
 * 		=>instance 블록
 * 		=>객체 생성 없이 화면에 출력=>static변수만 사용이 가능
 * 		=>instance 블록
 * 			=> 파일/데이터베이스/크롤링
 * 		----------------------------자동호출
 * 		=>생성자=>public 디폴트
 * 		***	static=> static 블록
 * 		***	instance=>생성자
 * 		***모든 변수는 은닉화 =>private
 * 	3. 구현
 * 		메소드=>다른 연결=>public
 * 		=static 메소드 :공통으로 적용되는 기능이 들어갈 때
 * 		=instance 메소드:각 객체마다 따로 수행하는 기능
 * 		=abstract 메소드:개발자에게 맡긴다
 * 						=>미완성:선언만 하는상태
 * 			|	설계 도구	=>추상클래스/인터페이스
 * 		=>static 메소드:클래스명.메소드.()
 * 		  Math.random()
 * 		=>instance 메소드 : 객체명.메소드()
 * 		  Scanner scan=new Scanner(System.in)
 * 		  scan.nextInt() =>인스턴스메소드
 * 		  String s="";
 * 		  s.length()
 * 	1.자바의 접근지정어
 * 	  = public 
 * 		어디서든 상관없이 접근 가능 상태=>공개
 * 		: 클래스,생성자,메소드
 * 	  = protected
 * 		같은 패키지에서 접근/다른패키지에서 접근하는 유일한거=>상속을 받은 클래스
 * 		..사용 빈도가 거의 없다
 * 	  = default
 * 		같은 패키지에서 접근
 * 		---------폴더
 *    =	private 비공개=>은닉화
 *    	=>자신의 클래스 내에서만 접근 가능=>인스턴스 변수
 *  2. public > protected>default>private
 *     =>오버라이딩시에 접근지정어는 축고할 수 없다
 *     class A
 *     {
 *     		void display(){}
 *     }
 *     class B extends A
 *     {
 *     		private void display(){}
 *     }
 * 
 * 
 */
//class A
//{
//	void display() {}
//}
//class B extends A
//{
//	private void display() {}
//}

//interface A
//{
//	void diplay();
//}
//class b implements A
//{
//	void display();
//}
/*
 * --------------------------------------------------------------------------------
 * 				같은 클래스 		 같은 폴더 			다른 클래스(상속)		모든 클래스
 * --------------------------------------------------------------------------------
 * private			O									
 * --------------------------------------------------------------------------------
 * default			O				O
 * --------------------------------------------------------------------------------
 * protected		O				O					 O
 * --------------------------------------------------------------------------------
 * public			O				O					 O					O
 * --------------------------------------------------------------------------------
 * 
 * 
 * =>한 명,한개에 대한 설계=>new
 * 
 * 
 */
class Sawon
{ // 캡슐화
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	private int sabun;
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
}
public class 접근지정어_1 {
	int b=10;
	void display(int a)
	{
		b=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong=new Sawon();
		hong.dept="개발부";
		hong.job="사원";
		hong.loc="제주";
		// =>메소드를 이용해서 접근
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		
		System.out.println("이름 : "+hong.getName());
		System.out.println("사번 : "+hong.getSabun());
		System.out.println("연봉 : "+hong.getPay());
		System.out.println("부서 : "+hong.dept);
		System.out.println("직위 : "+hong.job);
		System.out.println("근무지 : "+hong.loc);

	}

}
