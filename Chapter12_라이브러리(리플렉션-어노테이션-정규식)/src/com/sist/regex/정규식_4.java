package com.sist.regex;
// ? 기호 => 0회 or 1회
// color => colou?r=>u자가없을수도있고 1회있을수도있다
public class 정규식_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("color".matches("colou?r"));
		System.out.println("colour".matches("colou?r"));
		System.out.println("colouur".matches("colou?r"));
		System.out.println("colouur".matches("colou?.r"));
		System.out.println("cat".matches("c?a?t?"));
		System.out.println("".matches("c?a?t?"));


	}

}
