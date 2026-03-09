//어느때 다중if를 쓰고 어떨때 if를 여러개써야되는지 알아야함
import java.io.IOException;
import java.util.Scanner;

public class 제어문_단일조건문_2 {

	public static void main(String[] args) throws IOException {
		int num=15;
		if(num%3==0) 
		{
			System.out.println(num+"는(은) 3의 배수입니다.");
		}
		if(num%5==0) 
		{
			System.out.println(num+"는(은) 5의 배수입니다.");
		}
		if(num%7==0) 
		{
			System.out.println(num+"는(은) 7의 배수입니다.");
		}
		
		// 메뉴처리
		System.out.println("======메뉴======");
		System.out.println("1. 영화 목록");
		System.out.println("2. 뮤직 목록");
		System.out.println("3. 맛집 목록");
		System.out.println("4.레시피 목록");
		System.out.println("============");
		System.out.println("메뉴 선택:");
		Scanner scan=new Scanner(System.in);
		int menu=scan.nextInt();
		//' 버전 상승 =>경고(17버전)=>21버전
		if(menu==1)
		{
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://cgv.co.kr/");
		}
		if(menu==2)
		{
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe https://www.genie.co.kr/");
		}

	}
}
