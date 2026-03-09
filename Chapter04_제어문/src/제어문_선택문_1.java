import java.util.Scanner;
public class 제어문_선택문_1 {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("점수 입력:");
	int score=scan.nextInt();
	char op=' ';
	switch(score/10)
	{
	case 10:case 9:
		op='A';
		break;
	case 8:
		op='B';
		break;
	case 7:
		op='C';
		break;
	case 6:
		op='D';
		break;
	default:
		op='F';
		break;
	}
	System.out.println("학점:"+op);
}
}
