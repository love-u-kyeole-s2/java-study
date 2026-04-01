package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 	에러가 나는경우
 * 	=>컴파일시 에러/실행시 에러=>JavaScript 연동시 에러/파일이동 ?page=1 <a href="파일이동>
 * 	=>1. 사용자 입력 =>유효성검사=> IF=>예외처리=>선택
 * =>UnCheckException
 * 	  2. 개발자 실수
 * 		ip(네트워크) URL 데이터베이스 연결
 * 		파일명
 * =>CheckException

 * 	  ------------------------------수정이 가능	:예외
 * 	  3. 생각하지 못한 에러
 * 	  ------------------------------에러
 * 
 * 	예외처리
 * 		=>소스 상에서 수정이 가능한 에러
 * 	예외처리 범위(상속도)
 * 	위로 갈수록 범위가 커진다
 * 		Object
 * 		  |		  
 * 		Throwable :예외처리의 최상위
 * 		  |
 * --------------------------------------
 * |									|
 * Error 							Exception
 * 										|
 * 								-------------------
 * 								|				
 * 							 IOException:
 * 							 입출려메모리,네트워크,파일
 * 								|표준
 * 
 */
class MyException
{	public void aaa()
	{
	System.out.println("MyException: aaa() call");
	}
public void bbb()
{
System.out.println("MyException: bbb() call");
}
public void ccc()
{
System.out.println("MyException: ccc() call");
}
	
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("입력:aaa,bbb,ccc");
			String m=scan.next();
			Class className=Class.forName("com.sist.exception.MyException");
		Object obj=
				className.getDeclaredConstructor().newInstance();
		Method[] methods=className.getDeclaredMethods();
		for(Method mm:methods)
		{
			if(mm.getName().endsWith(m))
			{
				mm.invoke(obj, null);
			}
			
		}
		}catch(Exception ex) {}
		
	}

}
