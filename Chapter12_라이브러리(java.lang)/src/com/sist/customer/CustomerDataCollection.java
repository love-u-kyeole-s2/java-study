package com.sist.customer;

import java.io.FileReader;

public class CustomerDataCollection {
	public static CustomerVO[] customers= new CustomerVO[100];
	
	static
	{
		
		try
		{
			FileReader in=new FileReader("c:\\javaDev\\고객.txt");
			
			in.close();
			System.out.println(data);
		}
		catch(Exception ex)
		{
			
		}
	
	}
	public String isLogin(String id,String pwd)
	{
		String result="";
		int count=0;
		
		return result;
	}
	
	public static void main(String[] args) {
		CustomerDataCollection cdc = new CustomerDataCollection();
	}
	
	//기능
	//1. 로그인
	//2. 목록=>페이지 나누기
	//3. 검색 지역/등급 /등록일
	//4. 등록/삭제=>Collection
	//진심피곤 

}
