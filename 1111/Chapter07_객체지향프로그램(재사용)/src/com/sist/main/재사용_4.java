package com.sist.main;
/*
 * 1. 생성자 매개변수 여부 확인하기
 * 2. class A
 * 	  class B extends A <-이문법이억하기
 * 		A a=new A() (X)요거안씀
 * 		B b=new B()  요거나
 * 		A c=new b()  요런식으로
 *	    --- -------
 *		|	 ㄴ메소드 관리 
 * 		변수관리                                        
 */
class Human
{
	String name;
	String sex;
	public Human()
	{
		name="심청이";
		sex="여자";
		System.out.println("Human() Call...");
	}
}
class Student extends Human
{	//name , sex
	public Student (String name, String sex)
	{
		this.name=name;
		this.sex=sex;
	}
	public void display()
	{
		System.out.println("이름: "+name);
		System.out.println("성별: "+sex);
	}
}
class Sawon extends Human
{	String name,sex; //변수의 오버라이딩
	public Sawon() //
	{
		/*
		 * 생략가능한거
		 *  super()
		 * return/생성자/super()
		 * import java.lang
		 * extends Object
		 * --------------------이것들중 생략하면 안될때
		 * default 가 안되는 부분이있음
		 * 
		 * 
		 */
		System.out.println("Sawon() Call...");
		this.name="박문수";
		this.sex="남자";
	}
	public void display()
	{
		System.out.println("이름: "+super.name);
		System.out.println("성별: "+super.sex);
		System.out.println("이름: "+this.name);
		System.out.println("성별: "+this.sex);
	}
	//상속 내린클래스=>메모리 할당 (상위클래스의 생성자 )
	//그담 상송받은 클래스가=>메모리할당
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student("홍길동","성별");
		std.display();
		Sawon s=new Sawon();
		s.display();
	}

}
