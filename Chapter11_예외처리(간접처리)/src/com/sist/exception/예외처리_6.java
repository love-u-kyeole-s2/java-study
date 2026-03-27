package com.sist.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UncheckedException
		// => NumberFormatException
		// 웹/윈도우/모바일=>서버 데이터 전송/브라우저 전송 받기
		//=>모든 데이터 문자열
		// ?no=10 String no=request.getParameter("no")
		//NullPointerException
		// =>500
		//IllegalArgument Exception//매개변수값 다른 경우
		String image=null;
		// IS NOT NULL
		try
		{
			System.out.println(image.length());
			System.out.println("Image를 브라우저에 출력");
		}catch(NullPointerException e)
		{
			System.out.println("이미지 없음을 보내라");
		}
	/*
	 *  	String page=request.getParameter("page");
	 *  	=>문제
	 *  	=> if(page==null)
	 *  		page="1"
	 * 
	 */
		System.out.println("aaa");
		System.out.println("aaa");
		System.out.println("aaa");
		try {
			FileReader in=new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aaa");
		System.out.println("aaa");

	}

}
