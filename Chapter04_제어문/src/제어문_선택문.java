// 
//break 종료할 때 쓰는 거
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int no=1;
		switch(no)
		{
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		default://else역할 
			System.out.println("4");
		}
		
		
		switch(no)
		{
		case 10:
		case 9:
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
		}
		System.out.println(op);

		
	}
	
	

}
