//3명의 학생=>국어 영어 수학 점수 입력=> 총점,평균,학점,등수
// 현재 재사용이 안됨=>절차적 언어 사용중
// 	  -----------=>객체지향
// 프로그램 짜는 순서를 외운다.
import java.util.Scanner;
// 순서 제어문 데이터 저장
public class 등수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터를 저장할 공간
		// 기능별
		// 프로그래밍의 1번째 변수선언
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		// int[] [] student = new int[3][5] ==> 데이터베이스
		char[] score=new char[3];
		double[] avg=new double[3];
		String[]name=new String[3];
		Scanner scan=new Scanner(System.in);
		// 한명에 대한 정보==>인덱스랑 동일
		// ===>클래스형으로 바꾸고 
		//초기화

		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"이름:");
			name[i]=scan.next();
			System.out.println((i+1)+"번째 국어점수:");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째  영어점수:");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수학점수:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			String s=switch((int)(avg[i]/10))
					{
			case 10,9->"A";

			case 8->"B";
			case 7->"C";
			case 6->"D";
			default->"F";
			};
			score[i]=s.charAt(0);
		}
		//연산처리 ==>등수
		for(int i=0; i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//결과값
		/*
		 * %d=>정수
		 * %c=>문자 1개
		 * %f=>실수
		 * %s=>문자열
		 * 
		 * %5d=>다섯글자들어가게 만약 안녕 쓰면 =>"   안녕" 
		 * -넣으면 왼쪽정렬
		 * -%5,"안녕=>"안녕   "
		 * 
		 * 
		 */
		for(int i=0;i<3;i++)
		{
			System.out.printf("%7s%5d%5d%5d%7d%7.2f%3c%3d\n",name[i],kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}

}
