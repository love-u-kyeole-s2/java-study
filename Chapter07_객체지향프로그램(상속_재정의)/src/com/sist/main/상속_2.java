package com.sist.main;
/*
 * 상속=>다른 클래스의 변수/메소드는 사용이 가능
 * 					  -----
 * 						|프로그램에 맞지 않는다
 * 						|변경해서 사용:오버라이딩
 * 
 * 
 * 	오버라이딩: 변경해서 덮어쓴다.
 * 		1. 상속이 존재
 * 		2. 메소드명 동일
 * 		3. 매개변수 동일
 * 		4. 리턴형 동일
 * 		5. 접근지정어 =>확대 가능, 축소는불가
 * 			<=========이방향으로가능============
 * 		   public >protected>default>private
 * 		void aaa()
 * 			|   => 디폴트에서 더작게축소되어서 오류
 * 		private void aaa()
 * 
 *		void aaa()
 *		  |
 *		protected void aaa()
 *		public void aaa()
 *		void aaa()
 *
 * 
 * 	-----------------------------------------------------
 * 					오버로딩					오버라이딩
 *  -----------------------------------------------------
 *  메소드명			동일						  동일
 *  -----------------------------------------------------
 *  상태				같은 클래스내				상속이 된 상태
 *  -----------------------------------------------------
 *  매개변수			개수 데이터형이				개수 데이터형이
 *  				다르다					동일하다
 *  -----------------------------------------------------
 *  리턴형			관계없다					동일
 *  -----------------------------------------------------
 *  접근지정어			관계없다					확대만 가능/동일/축소
 *  -----------------------------------------------------
 *  오버로딩 => 같은 메소드를 이용해서 새로운 기능 생성
 *  오버라이딩 => 상속해서 받은 기능 변경하는 역할
 *  상속 =>오버라이딩(변경해서 사용이 가능)
 *  
 *  상속을 내림면 복사가아니라 메소드 변수를 따로 메모리에 저장한다음 사용가능하게 연결
 * 
 * class A{
 * int a,b;
 * }
 * class B extends A
 * {
 * int c
 * }
 * 
 * B b =new B()
 * 
 * ---------super
 * a=100,b=200 <-------
 * -------------	  |
 * 					  |	연결이 가능하게 만들어준다
 * ---------this ------ 
 * c
 * super.a=100,super.b=200
 * this.a=1000, this.b=2000=>하면 수퍼도바뀜 this도 int a,intb따로해줘야 슈퍼안바뀌고 저장영역따로잡힘
 * -------------
 * 
 * 
 * 
 */

class Animal
{
	public void run() {
		System.out.println("두 발로 걷는다");
	}
	public void eat() {
		System.out.println("수저로 먹는다");

		
	}
}
class Dog extends Animal
{
	
}
class Pig extends Animal
{
	
}
class Super
{
	int a,b;
	public void display()
	{
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
class Sub extends Super
{	int a,b;// this 변수 오버라이딩
	int c;
	public Sub()
	{
		super.a=100;
		super.b=200;
	}
	public void print()
	{	super.display();
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);

	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Dog dog=new Dog();
//		dog.run();
//		dog.eat();
		Sub sub=new Sub();
		sub.print();
		
	
	}

}
