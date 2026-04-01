import java.util.Arrays;
import java.util.Scanner;

public class 숫자야구게임_메소드 {
	//절차적언어
	static int[] getRand()
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)//첫번째는 검사하지 않는다.
			{
				if(com[j]==com[i])
				{
					//com[j]=>지금의 저장된 데이터
					//com[i]=>지금 발생한 난수
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		return com;
	}
	//사용자 입력
	static int[] userInput()
	{
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		while(true)
		{
			System.out.println("3자리 정수를 입력: ");
			int input=scan.nextInt();
			//정상입력인지 확인
			if(input<100||input>999)
			{
				System.err.println("세자리 정수만 입력해야됩니다.");
				//처음으로 다시 돌아감
				continue;//while=>조건식으로 이동
			}//배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			// 같은 수(X),0(X)
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.err.println("같은 수는 사용할 수 없습니다.");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.err.println("0은 사용할 수 없습니다.");
				continue;

			}break;
	}return user;
	}
	static int compare(int[] com,int[] user)
	{
		int s=0,b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
	}
	static void hint(int s,int b int[] user)
	{
		System.out.print("S:");
		for(int i=0;i<s;i++)
		{
			System.out.print("●");
		}
		System.out.print("\nB:");
		for(int i=0;i<b;i++)
		{
			System.out.print("○");
		}
		System.out.print("\n");

	}
	static boolean isEnd(int s)
	{
		if(s==3)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		//구조적언어
		// TODO Auto-generated method stub
		int[] com=getRand();
		//System.out.println(Arrays.toString(com));
		int[] user=new int[3];
		while(true)
		{
			user=userInput();
			compare(com,user);
		}
	}

}
