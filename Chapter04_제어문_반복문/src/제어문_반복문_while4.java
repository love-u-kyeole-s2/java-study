//메뉴
//메뉴 =>입력 
import java.util.Scanner;
public class 제어문_반복문_while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 사용자 키보드로 입력->값을 읽어서 메모리 저장=>api
		System.out.println("💕💕💕💕💕지니뮤직💕💕💕💕💕");
		while(true) //무한루프=>종료조건
			{
				System.out.println("=====메뉴=====");
				System.out.println("1. 가요");
				System.out.println("2. 트롯");
				System.out.println("3. OST");
				System.out.println("4. POP");
				System.out.println("5. Zazz");
				System.out.println("6. 클래식");
				System.out.println("7. 종료");
				System.out.println("=============");
				System.out.print("메뉴선택:");
				int menu=scan.nextInt();
				//다중 조건문/ 선택문 
				//에러처리 => 입력 잘못될 경우
				if(menu<1||menu>7)
				{
					System.out.println("없는 메뉴입니다!! 다시입력하세요");
					continue;
					/*
					 *  continue :
					 *	 	while=>조건식으로 이동
					 * 		for 증가식으로 이동
					 * 	break:
					 * 		  반복문 종료
					 * 
					 */
				}
				//다중 조건문/선택문
				if(menu==7)
				{
				//	1.System.exit(0); //프로그램 자체종료
				//	2.while을 종료
				//		 break
					System.out.println("프로그램 종료");
					break;
				}
				else if(menu==7)
				{
					//노래 출력
				}
			}
	}

}
