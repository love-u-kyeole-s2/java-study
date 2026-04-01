package com.sist.regex;
//문자 집합 [] [abc]=>a|b|c 포함 [(abc)]=>abc포함
/*
 * [abdef]=>그대로
 * [abcdef]=>[a-f]
 * 
 * => 알파벳=> [A-Z] [a-z] [A-Za-z]
 * => 숫자 [0-9]
 * => 한글 [가-힣] ==> 한글자=>글자수{5}
 * 		=>3,4,5=>{3,5}
 * 	127.0.1
 * 238.124.63.89
 * 255.255.255.255
 * [0-9]{1,3}
 * 
 * 이름 
 * 	[가-힣]{2,17} =>51bite=>오라클은 한글 3개라 3*17해서 51
 * 
 * 
 */
public class 정규식_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("cat".matches("[abc]at"));// aat bat cat
		System.out.println("a".matches("[a-z]"));
		System.out.println("A".matches("[A-Z]"));
		System.out.println("1".matches("[0-9]"));
		System.out.println("홍".matches("[가-힣]"));
		System.out.println("코메디".matches("[가-힣]*"));
		System.out.println("코메디".matches("[가-힣]{3}"));
		System.out.println("코메디".matches("^코[가-힣]*"));


	}

}
