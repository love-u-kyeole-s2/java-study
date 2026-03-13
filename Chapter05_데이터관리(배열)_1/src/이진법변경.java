/*
 * 
 * 
 * 
 * 
 * 	16bit=>32767
 *  -------------
 *  10
 *  0000 0000 0000 1010
 */
import java.util.Scanner;
public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] binary=new int[16]; //같은 용도로 사용되는 변수를 모아서 관리
		//저장순서 =>0부터 15
		int index=15;
		System.out.println("0~32767까지 사이의 정수 입력:");
		int num=scan.nextInt();
		//라이브러리
		//자바 => 기본문법=>검색(라이브러리(80)+사용자정의(20))
		//CBD프로그래머
		//=>프로그래머
		//=>juint
		System.out.println("라이브러리:"+Integer.toBinaryString(num));
		System.out.println("라이브러리:"+Integer.toOctalString(num));
		System.out.println("라이브러리:"+Integer.toHexString(num));

		//횟수가 저장되지 않았다=>while
		while(true)
		{
			//2로나누고 나머지 저장
			binary[index]=num%2;
			//2로 나눈다  =>1,0이 나올 때까지 반복
			num=num/2;
			// 1/2 = 0,0/2=0
			if(num==0)
				break;
			index--;
		}
		//실제 출ㄹ력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0&&i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
