package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 
 * 리플렉션 => 동적 제어
 * 	=>현재 실행중인 프로그램을 제어 
 * 				 ------
 *			     클래스 :  멤버 변수 / 생성자 / 메소드 
 * 	=> 클래스명을 이용
 * 	   반드시 =>패키지명부터 설정한다.
 * 	=> 메소드 제어(호출) , 변수값을 변경
 * 					  ------------ private 접근이 가능
 * 								   OOP가 깨진다 (보안,캡슐화)
 * 	=> 객체 생성 
 * 	=> 어노테이션 확인 가능
 * 	------------------------------------Spring(자동화)
 * 	=>리플렉션 + 어노테이션 : 프레임워크 개발할때 많이 나옴 
 * 	JSP		=		MVC		=		**Spring
 *  Vue   			Vuex			Rinia =====> **Nust
 *  React 			Redux 			**Next
 * 
 * 
 */
// 1. 클래스 정보 얻기 ( 멤버 변수 , 메소드 , 생성자 )
/*
 * 	  =>객체 생성 / 멤버 변수 주입 / 메소드 호출 => 자동화 처리
 * 2. 프레임워크 (솔루션) => 개발자
 * 	  프레임워크 사용 (SI/SM)=>프로그래머 
 */
class Sawon
{
	private String name;
	public Sawon() {}
	public Sawon(String name)
	{
		this.name=name;
	}
	public void info()
	{
		System.out.println("Sawon:info() call.. "+name);
	}
}


public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sawon sa=new Sawon(); //결합성이 강한 프로그램
// 		객체생성 =>ClassNotFoundException =>CheckedException
		try
		{	//클래스 정보 읽기
			Class clsName=Class.forName("com.sist.reflect.Sawon");
			//	클래스 정보에 생성자를 가지고온다┐
			Constructor con= clsName.getConstructor();
			//디폴트 생성자
			//메모리 할당
			Object obj=con.newInstance();
			//Method 읽기
			Method m=clsName.getMethod("info");//메소드 정보 갖고오기
			m.invoke(obj);//실제 메소드 호출 **인보크 기억 잘해놓기
		}catch(Exception ex) {}
	}

}
