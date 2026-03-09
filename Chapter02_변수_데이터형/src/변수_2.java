/*
* 사과 5개
* => 사과를 2개 먹었다
* => 현재 남아있는 사과의 개수
*/
import java.util.Scanner;
public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="한결";
		int apple=5;
		int eat=2;
		int left=(apple-eat);
		System.out.println(name+"은 사과 "+apple+"개를 가졌다. 그러다 "+eat+"개를 먹었다. 남은 사과의 개수는? : "+left);
/*
 * 국어 80점 영어 90점 수학 70점 3개의 평균을 구하시오
 * 
 */
	int korean=80;
	int english=90;
	int math=70;
	System.out.println((korean+english+math)/3);
	Scanner scan=new Scanner(System.in);
	//System.in 키보드에서 입력된 값을 읽어오는 역할
	//=>공백 / 엔터
	System.out.print("국어점수입력: ");
	int 국어=scan.nextInt();
	System.out.println("국어:"+국어);
/*
 * 
 */
	System.out.print("국어점수입력: ");
	int 국어2=scan.nextInt();
	System.out.print("수학점수입력: ");
	int 수학2=scan.nextInt();
	System.out.println("평균: "+(국어2+수학2)/2);
	
	
		System.out.print("국어 영어 수학 입력 : ");
		int 국어3=scan.nextInt();
		int 영어3=scan.nextInt();
		int 수학3=scan.nextInt();
		
		System.out.println("국어: "+국어3+" 수학: "+수학3+" 영어: "+영어3);
		System.out.println("총점:"+(국어3+영어3+수학3));
		System.out.printf("평균:%.2f",(국어3+영어3+수학3)/3.0);

	
	}

}
