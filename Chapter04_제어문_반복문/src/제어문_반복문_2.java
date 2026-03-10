/*
 * up/down
 * -----------
 * 컴퓨터에서 1~100사이의 숫자를 임의의 추출 => 난수
 * 
 * 사용자 입력
 * 		난수>입력값 ==>up
 * 		난수<입력값==>down
 * 		난수=입력값==>종료===>for(;;)
 * 							|종료=>System.exit
 *
 */
import java.util.Random;

import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random r = new Random();
		int com=r.nextInt(100)+1;
		for(;;) // 반드시 종료 시점을 지정한다
		{
			System.out.print("1~100 사이의 정수 입력:");
			int user=scan.nextInt();
			System.out.println("User Input:"+user);
			if(com>user)
				System.out.println("입력값보다 큰 수 입력(Up)");
			else if(com<user)
				System.out.println("입력값보다 작은 수 입력(Down)");
			else
			{	//같은 경우 종료
				System.out.println("승리!");
				System.exit(0);
			}
		}

}
}
