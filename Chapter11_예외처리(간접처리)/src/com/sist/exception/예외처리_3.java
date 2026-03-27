package com.sist.exception;
/*
 * 	★ 중요 ★
 *	에러메세지=>에러 확인 
 * 
 * 
 * 
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printStackTrace
		// GetMessage
		try
		{
			int a=10;
			int b=0;
			if(b==0)
			{
				throw new ArithmeticException("0으로 나눌 수 없습니다");
			}
			else
			{
				System.out.println(a/b);
			}
		}catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("타입:"+ex.getClass());
			ex.printStackTrace();
		}
	}

}
