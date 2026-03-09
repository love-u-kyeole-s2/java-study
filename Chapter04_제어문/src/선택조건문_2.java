/*
 * 윤년처리 =>년도 입력 => 윤년이다/윤년이 아니다
 
 * 윤년 조건
 * 	1. 4년마다
 * 	2. 100년마다 제외
 * 	3. 400년마다 한번씩 뭐?
 * ------------------------
 * 	(year%4==0)&&(year%100!=0)||(year%400==0)
 * 		4년마다 	  100년마다제외
 * 
 * 
 */
import java.util.Scanner;
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//키보드 입력값을 받아서 메모리에 저장
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		System.out.println("입력된 년도"+year);
		
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		else
		{
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}

}
