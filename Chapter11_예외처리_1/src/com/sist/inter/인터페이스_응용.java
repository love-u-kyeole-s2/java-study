package com.sist.inter;
import java.util.Random;
import java.util.Scanner;
interface Game{
	public void start();
		
	
}

class MoleGame implements Game{
	
	public void start() {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random(); // 난수 발생 1~3
		//점수 계산
		int score=0;
		//게임 =>5번 : 1~3=>선택 입력=>
		System.out.println(" 두더지👾게임 시작");
		System.out.println("1~3 사이의 두더지👾가 나오면 위치를 맞추세요");
		for(int i=1;i<=5;i++)
		{
			int mole= rand.nextInt(3)+1; //nextInt(3)=>0~2
			// =>1~3
			System.out.println("\n[라운드 "+i+"]");
			System.out.println("두더지가 나타났다!(1~3)");
			long startTime=System.currentTimeMillis();
			int input=scan.nextInt();
			long endTime=System.currentTimeMillis();

			long time=endTime-startTime;
			
			if(time>2000)
			{
				System.out.println("⏰ 너무 느림! 실패");
				continue; //i++
			}
			if(input==mole)
			{
				System.out.println("🔨💥 정답");
				score++;
			}
			else
			{
				System.out.println("🤣👾🤣오답!!");
			}
			
		}
		System.out.println("🎶 당신의 점수는"+(score*20)+"점입니다.");
	}

}
class SpeedGame implements Game{
	@Override
	public void start() {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random(); // 난수 발생 1~3
		System.out.println("⚡순발력 게임 시작!!");
		System.out.println("👍지금! 이 뜨면 Enter를 누르세요!!");
		System.out.println("🤦‍♀️🤦‍♀️ 빨리 누르면 실패");
		try
		{
			 //CheckException=> 반드시 예외처리가 존재
			System.out.println("\n 👻준비...");
			Thread.sleep(rand.nextInt(3000)+2000);//2~5초
		}catch(Exception ex) {}
		long startTime=System.currentTimeMillis();
		System.out.println("👍지금!");
		scan.nextLine();
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		if(time<100)
		{
			System.out.println("☠️반칙! 너무 빨랐어요!!");
		}else if(time<300)
		{
			System.out.println("엄청빠름:["+time+"ms]");
		}else if(time<700)
		{
			System.out.println("보통 속도:["+time+"ms]");
		}else
		{
			System.out.println("엄청느림:["+time+"ms]");

	}
}
}
public class 인터페이스_응용 {
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.print("게임 선택[두더지 게임(1),순발력(2):]");
//		int menu=scan.nextInt();
//		Game game=null;
//		if(menu==1)
//		{
//			game=new MoleGame();
//			game.start();
//			
//		}
//		else if (menu==2) {
//			game=new SpeedGame();
//			game.start();
//		}
		MoleGame mole=new MoleGame();
		SpeedGame speed=new SpeedGame();
		if(mole instanceof Game)
		{
			System.out.println("mole<Game");
		}else
		{
			System.out.println("mole>Game");

		}
			
		if(speed instanceof Game)
		{
			System.out.println("speed>Game");
		}else
		{
			System.out.println("speed<Game");

		}
		Object 
		
		StringBuffer sb=new StringBuffer();
		
		if(str instanceof Object)
		{
			System.out.println("String<Object");
		}
		
		if(obj instanceof String)
		{
			System.out.println("Object<String");
		}
		if(str instanceof Object)
		{
			System.out.println("String<Object");
		}
		/*
		 * 일반기본형=> == !=
		 * 문자열 =>equals
		 * 객체 =>instanceof==>객체 찾ㅇㄷㄷㅈㄷㄷㄷ기
		 * @Autowired=>자동화
		 * 
		 */
		}
	}

