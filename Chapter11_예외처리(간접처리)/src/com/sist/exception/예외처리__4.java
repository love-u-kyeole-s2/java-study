package com.sist.exception;

public class 예외처리__4 {
	public static int test()
	{
		try
		{
			return 1;
		}
		catch(Exception e) //Throwable ex
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println(test());
	}

}
