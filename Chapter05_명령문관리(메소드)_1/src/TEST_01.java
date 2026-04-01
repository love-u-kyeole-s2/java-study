//사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
import java.util.*;
public class TEST_01 {
	static void id()
	{
		
	}
	//우편번호를 검색하는 메소드 원형을 작성하시오
	static void address()
	{
		
	}
	static void gugudan()
	{
		
	}
	//1. 1~10까지 출력하는 메소드 구현 =>출력 (void)
	static void print(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	
	//2. 1~10까지 합을 구하는 메소드 구형 =>리턴형이 존재
			

	
	static int sum2(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum; // 계산 결과 넘겨준다 
	}
	//3. 1~n까지 합을 구하는 메소드 구현==>n매개변수
	static int print3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	//4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	// 매개변수 2 리턴형 String

	static String div(int a,int b) 
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다";
		else
			result=a+"/"+b+"="+(a/(double)b);
			
		return result;
	}
	//5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	
	static char change(char c)
	{		

//		Character.toUpperCase(c); 
//		Character.toLowerCase(c);
// 
	return (char)(c-32);
	}
// 6. 문자열을 거꾸로 출력하는 메소드 구현
	// 그림을 거꾸로 출력하는 프로그램을 출력하시오 : 코딩테스트
	/*
	 *   FileInputStream fis= new FileInputStream("파일의 경로명")
	 *   byte[] buffer=new byte[4096];
	 *   for(int i=buffer.length-1;i>=0;i--)
	 *   {
	 *   	System.out.println(buffer[i]);
	 *   }
	 */
	static void upside(String msg)
	{
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.print(msg.charAt(i));
		}
	}
// 정수를 입력받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
// 정수 입력
// 이진법처리
	//입력받는메소드
 static int input()
 {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("정수 입력(0~32767):");
	 return scan.nextInt();
 }
 static int[] binary(int num)
 {
	 int[] b=new int[16];
	 int index=15;
	 while(true)
	 {
		 b[index]=num%2;
		 num/=2;
		 if(num==0) break;
		 index--;
	 }
	 return b;
 }
 static void print5(int[] arr)
 {
	 for(int i=0;i<arr.length;i++)
	 {
		 if(i%4==0&&i!=0)
			 System.out.print(" ");
		 System.out.print(arr[i]);
	 }
 }
	
 // 정렬 처리
 	static int[] sort(int[] arr)
 	{
 		for(int i=0;i<arr.length-1;i++)
 		{
 			for(int j=i+1;i<arr.length;j++)
 			{
 				if(arr[i]>arr[j])
 				{
 					int temp=arr[i];
 					arr[i]=arr[j];
 					arr[j]=temp;
 				}
 			}
 		}
 		return 
 	}
 	static void print6(int[] arr)
 	{
 		
 	}
 	
 	static int inputYear()
 	{
 		Scanner scan=new Scanner(System.in);
 		System.out.println("년도 입력:");
 		return scan.nextInt();
 	}
 	
 	static boolean isYear(int year)
 	{
 		if((year%4==0&&year%100!=0)||(year%400==0))
 			return true;
 		else
 			return false;
 	}
 	static void print7(boolean b)
 	{
 		if(b==true)
 			System.out.println("윤년입니다.");
 		else
 			System.out.println("윤년이 아닙니다.");
 	}
 	// 메소드 쪼개는법
 	//1. 사용자 입력
 	//2.기능처리
 	//3.화면출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			
			Scanner scan=new Scanner(System.in);
			System.out.println("알파벳을 입력하시오");
			
			upside("Hello Java");
			int num=input();
			
			int[] arr=init();
			int[] arr2=sort(arr);
			print6(arr2);
			
			int year=inputYear();
			boolean b=isYear(year);
			print7(b)
			// 1.
			
			
	}
	
	


}
