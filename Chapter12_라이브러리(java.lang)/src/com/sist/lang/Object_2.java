package com.sist.lang;
// 복제 => clone()
/*
 *  얕은 복사 => Call By Reference
 *  			같은 메모리 주소 사용 => 별칭 양쪽이 다 바뀜
 *  			class A
 *  			A a=new A()
 *  			A b=a;
 *  			=> 매개변수로 같은 값을 받아 처리한다면 
 *  깊은 복사 => 새로운 메모리 생성
 * 
 * 
 */
class Member implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	String name = "홍길동";
	public void dispaly()
	{
		System.out.println("이름: "+name); 
	}
}

class CallByReference
{
	public void change(Member m)
	{
		m.name="박문수";
	}
}
public class Object_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//객체 생성
//		Member m1 = new Member();
//		m1.dispaly();
//		// 객체 주소를 복사
//		Member m2=m1; // 별칭 => Call By Reference 프로그램
//		// 주소 같은 경우에는 m1,m2=>같은 메모리 주소제어
//		m2.name="심청이";
//		m1.dispaly();
//		System.out.println("m1="+m1);
//		System.out.println("m2="+m2);
//		CallByReference c = new CallByReference();
//		c.change(m1);
//		m1.dispaly();
//		
		// 게임 => 아바타 => Adapter 패턴 
		Member m1 = new Member();
		m1.name="이순신";
		Member m2 =(Member)m1.clone();
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		//  이걸 이용해서 만드는 프로그램 git clone
	}

}
