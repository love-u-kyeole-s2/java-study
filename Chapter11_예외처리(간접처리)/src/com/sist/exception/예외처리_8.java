package com.sist.exception;
class MyException extends Exception{
	private String msg;
	public MyException(String msg)
	{
		super(msg);
	}
}
/*
 * 	[0-9){1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1.3}
 *  127.0.0.1
 *  236.63
 * 
 * 
 */
public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		try
		{
			if(c>='A'&&c<='Z')
			{
				throw new MyException("소문자만 입력이 가능합니다");
			}
			
		}catch(MyException e)
		{
			
		}
	}

}
