/*
 * 	형식)
 * 		if(조건)==>부정연산자 /논리연산자/ 비교연산자 => true/false
 * 		{실행문장 =>조건이 true 일 때 수행
 * 		}//조건이 false면=>if 문장 제외
 * 
 * 	컴퓨터와 가위바위보 게임
 * 			------ 가정 가위0,바위1,보2
 * 	컴퓨터	사용자
 *	가위		가위 
 * 			바위
 * 			보
 * 	바위		가위
 * 			바위
 * 			보
 * 	보		가위
 * 			바위
 * 			보

 */
import java.util.Scanner;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int a=10;
//			if(a==10)
//				System.out.println("a="+a);//if소속
//			System.out.println("프로그램 종료!!");//if와 관련 없다 =>무조건적으로 수행
//  if 문이많이쓰일수록 속도가줄어들이까 최소한으로 쓸수있는법생각하기 
		int com=(int)(Math.random()*3);//0,1,2
						//0.0~0.99=>0.0~2.999=>0.2
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2)");
		int user=scan.nextInt();
		System.out.print("사용자: ");
		if(user==0)System.out.print("가위");
		if(user==1)System.out.print("바위");
		if(user==2)System.out.print("보");
		System.out.println();

		System.out.print("컴퓨터: ");
						if(com==0)System.out.print("가위");
						if(com==1)System.out.print("바위");
						if(com==2)System.out.print("보");
						System.out.println();

						int res=com-user;
						if(res==-1||res==2)
							System.out.println("사용자 Win!");
						if(res==1||res==-2)
							System.out.println("컴퓨터 Win!");					
						if(res==0)
							System.out.println("비겼다"); 
						
						
	}

}
