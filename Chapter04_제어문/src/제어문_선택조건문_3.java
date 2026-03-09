/*
 * => 절대값 출력
 * 
 * 프로그램
 * 	=> 평문 (절차적 언어) : 순차적으로 처리
 * 	=> 조건문(선택문) : 필요에 따라서 건너뛴다/프로그램에 맞게 수행
 * 		=>에러처리: 나누기하는 경우에 =>0을 처리 
 * 		=>로그인/아이디 중복/아이디 찾기/ 검색, 상세보기
 * 	=>반복문 :무한스크롤 ,게임,네트워크,데이터베이스,크롤링 
 * 	=>반복제어문:break,continue(제외)
 * 	*** 연산자 활용
 * ---------------------
 *  
 */
import java.util.Scanner;
public class 제어문_선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		System.out.println("검증:"+Math.abs(num));
		if(num==0)
		{
			System.out.println("잘못된 입력입니다!!");
			return;
		}
		else
		{
			if(num<0)
			{
				System.out.println(num*-1);
			}
			else
			{
				System.out.println(num);
			}
		}
	}

}
