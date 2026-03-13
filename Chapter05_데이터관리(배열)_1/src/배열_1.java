/*
 *	데이터 저장(관리)
 * 	=>1개 저장
 * 	=>같은 데이터 여러개 저장
 * 	=>다른데이터 여러개 저장
 * 	------- 메모리 저장 -------
 * 	영구적인 저장
 * 	=> 파일
 * 	=> 오라클/MySQL(RDBMS)
 * 		=>DB2
 * 	=>XML/JSON
 * -------------------------------
 * 						클래스
 * 						-----
 * 						1.데이터보호 : 캡슐화
 * 						2. 재사용: 상속/포함
 * 						3. 수정/추가:오버라이딩/오버로딩
 * 							=>다형성
 * 						4. 공통
 * 							=> 추상화
 * 	클래스 여러개=>한개의 변수로 제어=>인터페이스
 * ---------------------------------------------
 * 						|
 * 					비정상종료/에러처리=>예외처리
 * 	9장: 라이브러리
 * 	==> 개발한 클래스+라이브러리 => 한개 프로그램
 * 		----------------------------조립----------
 * 		자바==>오라클
 * 		|		|
 * 		---------
 * 		   연결==>JSP
 * 		----------------------------------------- 묶어준 프로그램
 * 			Spring==> 단순화 SpringBoot
 * 				|				|
 * 				-----------------
 * 						GIT=>CI/CD
 * 							------
 * 							문제=> 운영체제
 * 							-----------------셋팅(Docker)
 * 							-----------------Docker(Docker Hub)
 * 							---------여러개 동시에
 * 									 Docker-Compse/쿠바네티스
 * 									 ------------  -------
 * 	기본문법
 * 	=>변수/배열
 * 	=>연산자/제어문								
 * 	
 * class movie{
 * String ranke,title,actor,poster,grade,regdate,director
 * }
 * 
 * Movie[] movies=new Movie[1998]
 * 	JDBC=>게시판 :300줄
 * 	MyBatics=>120줄
 *  JPA=>7줄
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rank=new String[1938];
		String[] title=new String[1938];
		String[] genre=new String[1938];
		String[] rposter=new String[1938];
		String[] actor=new String[1938];
		String[] regdate=new String[1938];
		String[] grade=new String[1938];
		String[] rank=new String[1938];



	}

}
