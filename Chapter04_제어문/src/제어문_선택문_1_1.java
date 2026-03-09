
public class 제어문_선택문_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break를 생략이 가능
		//간결하게 처리
		//=>값 반환하는 기능
		// jdk 14이상==> 자바스트립트:=>
		String grade=switch(score/10) {
		case 10,9->"A";
		case 8->"B";
		case 8->"C";
		case 8->"D";
		default->"f";
		};
		System.out.println("학점:"+grade);

	}

}
