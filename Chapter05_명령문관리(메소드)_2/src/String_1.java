/*
 * 웹개발
 * 	---String/ArrayList/Integer
 * 	   ------ 자바에서 지원하는 메소드=>리턴형 /매개변수/어떤 값
 * 	게임개발/네트워크=>5000
 * 	웹개발:데이터베이스:입문
 * 		 ---------
 * 	비교
 * 		equals /equalsIgnoreCase
 * 		|		 ㄴ검색=>대소문자 고분이 없다
 * 		|			JAVA/Java/java ...
 * 		ㄴ ID/PWD==>대소문자 구분
 * 
 * 
 */
public class String_1 {
public static void main(String[] args) {
	String  hong="admin";
	String shim="admin";
	String park=new String("admin");
	//new는 새로운 메모리에 저장할 때 사용
	String lee="Admin";

	if(hong==shim)
	{
		System.out.println("hong과 shim은 같다");
	}
	else
	{
		System.out.println("hong과 shim은 같지않다");
	}//hong 주소 안에 있는 문자열 /park안에 저장된 문자열이 같은지
	if(hong.equals(park))
	{
		System.out.println("hong과 park은 같다");
	}
	else
	{
		System.out.println("hong과 park은 같지않다");
	}
	//가급적이면 => ==보다 equals를 많이 사용
	//=>상세보기/아이디찾기/비밀번호찾기 =>equals를 이용해서처리한다
	
	if(hong.equals(lee))
	{
		System.out.println("hong과 lee는 같다");
	}
	else
	{
		System.out.println("hong과 park는  같지않다");
	}
	//대소문자 구분없이 비교 equalsIgonoreCase
	//검색
	/*
	 * 	boolean equalsIgnoreCase(String s)
	 * 	boolean equals(String s)
	 * 	------->조건문(IF문)에서 주로 사용 많이한다
	 */
	if(hong.equalsIgnoreCase(lee))
	{
		System.out.println("hong과 lee는 같다");
	}
	else
	{
		System.out.println("hong과 park는  같지않다");
	}
	}
}
