/*
 * 	41page
 * 	정수 타입
 * 	--------------------------
 * 	정수
 * 		byte => 1byte(네트워크,파일 읽기)
 * 		int	 => 4byte(일반 숫자에 주로 사용)=프로그램에서 가장 많이 사용
 * 		long => 주로 시간 ,날짜 처리 할 때 
 * 	--------------------------
 * 	문자
 * 	--------------------------
 * 	논리
 * 	--------------------------
 * 
 * 출력형식
 *  System.out.print()=> 가로 출력 (inline)
 *  System.out.println()=> 세로출력(block)
 *  System.out.printf()=> 서식이 있는 경우
 * 
 * 
 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.*; //java (1.0) /javax(1.2)

public class 변수_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ctrl+/->한줄씩 주석처리됨

//File f=new File("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수_정리.java");
//			long l=f.lastModified();
//			System.out.println(l);
//			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(l)));
/*
 * 
 * 		변수선언
 * 		변수 = 초기값
 * 			  -------명시적
 * 			  -------입력값
 * 			  -------랜덤
 * 						Math.random()
 * 						-------------
 * 							(int)(0.0~0.99) =>0~99+1
 * 			  -------외부에서 데이터 읽기
 * 			  -------
 * 
 * 
 * 
 */
		String name=JOptionPane.showInputDialog("이름 입력:");
		System.out.println(name);
		int kor=(int)(Math.random()*101);
		int eng=(int)(Math.random()*101);
		int math=(int)(Math.random()*101);
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);

		Random r=new Random();
		int kor2=r.nextInt(101);
		int eng2=r.nextInt(101);
		int math2=r.nextInt(101);
		System.out.println("국어:"+kor2);
		System.out.println("영어:"+eng2);
		System.out.println("수학:"+math2);
		System.out.print("국어 영어 수학\n");
		System.out.print("80 80 80");
		System.out.println("Hello");
		System.out.println("Java");
		
		System.out.printf("%3d%3d%3d\n",90,90,90); //printf 사용할 때 소숫점 짤라낼때 
		System.out.printf("%.2f",10/3.0); //printf 사용할 때 소숫점 짤라낼때 


	}

}
