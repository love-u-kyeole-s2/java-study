/*	논리연산자 : 조건문 (유효성 검사, 범위,기간 확인), 반복문
 * 	조건 =>부정/논리/비교=>사용이가능
 * 	=>boolean
 * 	1.조건문(조건문이 좀더 어려움) / 반복문
 *	--------------- 
 * 	2. 제어문에 초점 맞추기 :연산자 => 형식 , 결과값
 * -------------------------메소드(핵심:제어문하고 연산자) =>여러개 모아서 저장=>재사용
 *
 *		&&(조건 모두 true) , ||(조건 1개 이상 true)
 *
 */
import java.util.Scanner;
public class 이항연산자_논리연산자_1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("점수 입력(0~100)");
	//&& 정상처리
	//||비정상처리
	int score=scan.nextInt();
	String res=score>=0&&score<=100?"정상입력":"비정상입력";
	System.out.println("res:"+res);
}
}
	
