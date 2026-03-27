package com.sist.exception;
/*
 * 	 try-catch 기본 구조
 *   throws VS thorw 차이
 * 	 finally 역할
 * 	 try-with-resource
 * 	 ------------------
 * 	 예외 선언=>예외 회피=> 다음에 호출시에 예외처리를 해야된다
 * 						--------------------------
 * 						=>예외 떠맡기기:예상만 한다
 * 	 =>라이브러리에서 주로 사용
 * 	 => 일반 개발자 =>try~catch를 주로 사용
 * 		=>try~catch:80%,thorws:20%
 * 	 => 형식)
 * 		[접근지정어][제어어] 리턴형 메소드명(매개변수..) throws
 * 			Exception,NumberFormatException,....
 * 			---------------------------------------
 * 				순서가 없다
 * 			=>기본 : throws Exception	
 * 					throws Trowable
 * 	
 * 
 * 
 * 
 * 
 */
public class 예외처리_5 {
	public static void div(int a,int b) throws Exception
	{
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		div(10,3);
		//처리하는 방법
		//직접 처리 =>try~catch 절을 쓸거냐 
		// 다음에 호출시 처리 => throws
	}

}
