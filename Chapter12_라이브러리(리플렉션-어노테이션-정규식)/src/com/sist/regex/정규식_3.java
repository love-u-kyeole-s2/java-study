package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 1번도 반복 안하면 *
// 1번이상 반복 => +
// +나 *을 문자로 인식하려면 \\+ \\* 등 앞에 \\붙인다.
// 기호 => 검색 기호로 사용하지 않고 기호 자체를 사용하려면 ==>\\
public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("heeeeeeeeeeello".matches("he+llo"));
//		//e가 한 번 이상 반복하고 있는지...
//		try
//		{
//			Document doc =
//					Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get(); 
//			Pattern p =Pattern.compile("watch\\?v=[^가-힣]+");
//			Matcher m=p.matcher(doc.toString());
//			while(m.find())
//			{
//				String s = m.group();
//				s=s.substring(s.indexOf("=")+1,s.indexOf("\""));
//				System.out.println(s);
//			}
//		}catch(Exception ex) {}
		System.out.println("he".matches(".."));
		System.out.println("he".matches("h*."));
		System.out.println("he".matches("he*"));
		System.out.println("he".matches("h+e+"));



	}

}
