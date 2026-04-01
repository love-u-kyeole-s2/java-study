/*
 * 	String은 변경할 수 없다./있는 그대로 사용/
 *  String =>단점 : final
 *  ---------------> 표준화(개발자가 동일하게 사용)
 * 	검색
 * 		startsWith :첫글짜가 동일	--->A%
 * 		endsWith: 끝문자열이 같은경우--->%A
 * 		-------- 서제스트
 * 		contains: 문자 포함된-------->%A%
 * 		-------- 검색
 *161page
 */
import java.util.Scanner;

public class String_2 {
public static void main(String[] args) {
	String[] subject=
		{
		"혼자 배우는 자바",
		"자바 AND Spring",
		"기본 자바",
		"이것이 자바",
		"Java AND JSP",
		"Oracle AND Java",
		"자바로 시작한 JSP",
		"JSP AND 자바"
		};
	// 크롤링=>노래 검색 /맛집 검색/명소 ...


Scanner scan=new Scanner(System.in);
	System.out.print("검색어 입력: ");
	String fd=scan.next();
	for(String data:subject)
	{
		if(data.startsWith(fd))
		{
			//검색어로 시작하는 교재를 읽고온다
			//웹의 쿠키 읽기
			System.out.println(data);
		}
	}
	
	System.out.print("끝나는 문자열 찾기: ");
	for(String data:subject)
	{
		if(data.endsWith(fd))
		{
			//검색어로 시작하는 교재를 읽고온다
			//웹의 쿠키 읽기
			System.out.println(data);
		}
	}
		
	System.out.print("포함된 문자열 찾기: 가장 많이 사용 ");
	for(String data:subject)
	{
		if(data.endsWith(fd))
		{
				//검색어로 시작하는 교재를 읽고온다
				//웹의 쿠키 읽기
				System.out.println(data);
		}
	}
	
}
}
