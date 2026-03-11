/*
 * 
 * 	1.while
 * 		사용자가 구구단=>단을 입력하면
 * 		해당단을 출력
 * 		------------------------
 * 		변수->사용자가 입력한 단이 필요
 * 			--------------------
 * 			루프변수 :1~9
 * 
 */
import java.util.Scanner; // 사용자가 입력이 있는경우
/*
 * 	nextInt() ==>정수입력
 * 	nextdouble()====실수입력
 * 	next() ==>문자열입력==>공백이 있는경우
 * 	nextLine()===>문자열 -===>공백포함
 * -------------------------문법
 * 
 * 
 * 
 */
public class 제어문_반복문_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("원하는 단 입력 :");
		int dan=scan.nextInt();
		//사용자 요청한 데이너 저장
		//요구사항 출력====처리
		//출력
		int i=1; //1~9까지 변경되는 변수 :루프변수(반복문)
		while(i<=9)
		{
			System.out.printf("%d * %d= %d\n",dan,i,dan*i);
			i++;
		}
	}

}
