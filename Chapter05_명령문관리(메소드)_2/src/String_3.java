/*
 * 	목표
 * 	1.메소드 이해
 * 	2. String 클래스 이해
 * 	3. 객체지향 개념
 * 	------------------
 * 	4. 상속/포함
 * 	5. 다형성
 * 	6. 클래스 설계
 * 	7. 인터페이스
 * 	-------------------
 * 	8. 예외처리
 * 	9. java.util/java.lang
 * 	10. java.io/java.net
 * 	11.java.sql
 * 
 * 	import java.lang.*=>자주사용 =>생략이 가능
 * 		   ---------- String/Math
 * 	String => 주요 메소드
 * 		원하는 위치(인덱스 번호 찾기)
 * 		indexOf/lastIndexOf-뒤에서찬지=>경로 찾기/파일 찾기
 * 		ㄴ앞에서찾기=> 문자 찾는 경우
 * 		int indexOf(char c)
 * 		int indexOf(String s)
 * 		==> 리턴값 -1일경우=>없는경우
 * 
 * 		int lastIndexOf(char c)
 * 		int lastIndexOf(String s)
 * 		=>리턴값 -1일 경우=>없는경우에 해당
 * 		a.jpg =>lastIndexOf
 * 		  ---
 * 		a.a.jpg
 * 	    --
 * 		c:\\javaDev\\javaStudy
 * 164page
 */
import java.io.*;
public class String_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		File dir=new File("c:\\javaDev");
//		File[] files=dir.listFiles();
//		for(File f:files)
//		{
//			if(f.isFile())
//			{
//			String name=f.getName();
//			String ext=name.substring(name.lastIndexOf(".")+1);
//			System.out.println(ext);
//			}
//		}
		String msg="Hello Java!!";
		System.out.println("a의 위치:"+msg.indexOf("a"));
		System.out.println("a의 위치:"+msg.lastIndexOf("a"));
		System.out.println("b의 위치:"+msg.indexOf("b"));
		System.out.println("b의 위치:"+msg.lastIndexOf("b"));
		String ext=msg.substring(msg.lastIndexOf("b")+1);
		System.out.println(ext);
		//문자열을 사용해서 제어=>원본은 불변

	}

}
