package com.sist.regex;
// 0개 이상 반복 => *
public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello".matches("H*.llo"));
		System.out.println("ho".matches("h.*o"));
		// h.*o 
		// --- 임의의한글자가 있을 수도 있고 없을 수도 있다
		
		System.out.println("hhsfdsaffaaf".matches("h*.*"));
		System.out.println("hello".matches(".*"));
	}	

}
