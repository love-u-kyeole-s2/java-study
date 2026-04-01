package com.sist.lang;
/*
 * 
 * 
 * 
 * clone /toString/hashCode/equals
 * --------------------------------
 * =>record
 * class record Sawon
 * {
 * 		=>변수 설정=>Setter는 안되고 getter만사용 :Spring AI
 * }
 * 
 * 
 */
//보안 => 데이터를 
record Person(String name,int age)
{
	
}
public class Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person("홍길동",20);
		System.out.println("이름: "+p.name()); // getter
		System.out.println("나이: +"+p.age());
	}

}
