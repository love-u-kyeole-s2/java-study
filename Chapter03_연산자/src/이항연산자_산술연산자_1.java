import java.util.Scanner; // 키보드로 입력된 값을 가지고 온다
public class 이항연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("국어입력:");
			int kor=scan.nextInt();
			System.out.println("영어입력:");
			int eng=scan.nextInt();
			System.out.println("수학입력:");
			int math=scan.nextInt();
			
			int total=kor+eng+math;
			
			double avg=total/0.0;
			
			System.out.println("국어점수:"+kor);
			System.out.println("영어점수:"+eng);
			System.out.println("수학점수:"+math);
			System.out.println("================ 최종결과 ============= ");
			System.out.println("총점:"+total);
			System.out.printf("평균:%.2f\n",avg);
			System.out.println(5%0.0);

	}

}
