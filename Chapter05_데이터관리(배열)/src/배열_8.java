// => 컴퓨터 => 가위바위보 10=>10=>2승2무6패
import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		String[] res= {"가위","바위","보"};
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			if(user<0||user>2)
			{
				System.out.println("잘못된 입력입니다!!");
				i--;
				continue;
			}
			System.out.println("컴퓨터:"+res[com]);
			System.out.println("컴퓨터:"+res[user]);
			int r=com-user;
			if(r==-1||r==2)
				win++;
			else if(r==1||r==-2)
				lose++;
			else
				same++;
			if(r==-1||r==2)
				System.out.println("User Win!");
			else if(r==1||r==-2)
				System.out.println("Computer Win!");
			else
				System.out.println("비겼습니다.");

		}
		System.out.printf("결과:%d승-%d무-%d패\n",win,same,lose);
//		System.out.print("가위(0), 바위(1), 보(2):");
//		int user=scan.nextInt();
//		System.out.println("컴퓨터:"+res[com]);
//		System.out.println("사용자"+res[user]);
//		if(com==0)
//			System.out.println("가위");
//		else if(com==1)
//			System.out.println("바위");
//		else if(com==2)
//			System.out.println("보");
//		System.out.println("============= 결과값 ========");
//		int r=com-user;
//		if(r==-1||r==2)
//			System.out.println("User Win!");
//		else if(r==1||r==-2)
//			System.out.println("Computer Win!");
//		else
//			System.out.println("비겼습니다.");

		
		}

	}
