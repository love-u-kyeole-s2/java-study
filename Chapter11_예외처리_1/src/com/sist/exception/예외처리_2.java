package com.sist.exception;
import java.io.*;
// IOException=>Exception=> Throwable
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		try
		{
			in=new FileReader("C:\\javaDev\\javaStudy\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
			int i=0;
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{	try
			{in.close();
			}catch(Exception e) {}
			}
		}

	}


