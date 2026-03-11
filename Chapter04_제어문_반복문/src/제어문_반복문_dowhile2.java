/*	난수=>1~100 사이의 수를 임의로 추출
 * 	맞추는게임
 * 
 * 	힌트=>(up/down
 */
import java.util.*;
//=>random/scanner
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컴퓨터 난수
		Random r=new Random();
		int com=r.nextInt(100)+1; //변경해서 사용:오버라이딩
		Scanner scan=new Scanner(System.in);
		do
		{
			System.out.println("1~100 사이의 정수 입력: ");
			int user=scan.nextInt();
			// 사용자가 잘못 입력한 경우 => if문
			if(user<1||user>100)
			{
				System.out.println("잘못된 입력입니다!!");
				continue; //처음으로 다시 이동할 때
			}
			//결과 비교
			if(com>user)
				System.out.println("입력값보다 큰 정수 입력(UP)");
			else if(com<user)
				System.out.println("입력값보다 작은 정수 입력(Down)");
			else
			{
				System.out.println("정답!! 게임종료");
				break;
			}
		}
		while(true);
		
	}

}
