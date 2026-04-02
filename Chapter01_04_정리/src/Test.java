import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 
//양수인지 음수인지 판별하여 출력하라
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int num=scan.nextInt();
		if(num>0)
			System.out.println(num+"은(는) 양수입니다.");
		if(num<0)
			System.out.println(num+"은(는) 음수입니다.");
		if(num==0)
			System.out.println(num+"은(는) 음수도 양수도 아닙니다.");
//2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
		System.out.println("정수를 입력하시오: ");
		int num2=scan.nextInt();
		if(num2%3==0)
			System.out.println(num2+"는(은) 3의 배수입니다.");
		else
			System.out.println(num2+"는(은) 3의 배수가 아닙니다.");
		System.out.println("정수를 입력하시오: ");	
		int num3=scan.nextInt();
		if(num3>=0)
			System.out.println(num3+"의 절댓값:"+num3);
		else
			System.out.println(num3+"의 절댓값:"+(-num3));
		
		//4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
//		기본: 연도가 4의 배수일 때 (
//				).
//				예외 1: 4의 배수이더라도 100의 배수이면 평년 (
//				).
		System.out.println("연도를 입력하시오: ");	
		int year=scan.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 평년입니다.");

		//5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
		  // 60점 이하면 F를 출력하라 (다중 if 사용)
		System.out.println("성적을 입력하시오 (0~100)");
		int score=scan.nextInt();
		while(100<score||score<0)
		{
			System.out.println("잘못입력하셨습니다. 다시입력하세요.(0~100)"+ "");
			score=scan.nextInt();
		}
		if(score>=90) 
			System.out.println("점수:"+score+" 학점: A");
		else if(score>=80)
			System.out.println("점수:"+score+" 학점: B");
		else if(score>=70)
		System.out.println("점수:"+score+" 학점: C");
		else if(score>=60)
		System.out.println("점수:"+score+" 학점: D");
		else
		System.out.println("점수:"+score+"학점: F");
		
		jhh
// 7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
//(switch~case 사용) 
		System.out.println();
		S
		int num4=scan.nextInt();

		int num5=scan.nextInt();

		   }
	

	}


