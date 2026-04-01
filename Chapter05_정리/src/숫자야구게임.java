/*//소스는 변경 사항이 없다.
 * 1. 난수 발생=>3개의 난수 =>중복 없는 난수 
 * 2. 사용자 입력
 * 	  =>유효성 검사
 * 3. 난수 /사용자 입력 비교
 * 4. 힌트 제공
 * 5. 종료 여부
 * 
 * 	static boolean isYear(int year)
 * 	{
 * 		boolean bCheck=false;
 * 		if((year%4==0&&year%100!=0)||(year%400==0))
 * 		{
 * 			bCheck=true;
 * 		}
 * else넣으면안됨 무한루프됨 트루만되고 나머지 디폴트 넘어가게
 * 		return bCheck;
 * 
 * 	}
 * 
 * 
 */

import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.난수 발생 ==>Set(중복 없는 데이터 저장)
		//=>DISTINCTCV
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
//		int su=0;
//		boolean bCheck=false;
//		for(int i=0;i<com.length;i++)
//		{
//			bCheck=true;
//			//중복체크=>중복=>bCheck:true/ 중복아니면 bCheck=false로 빠져나감
//			while(bCheck)
//			{
//				su=(int)(Math.random()*9)+1;
//				bCheck=false;//while 종료
//				for(int j=0;j<i;j++)
//				{
//					if(com[j]==su)
//					{
//						bCheck=true;
//						break;
//					}
//		
//				}
//			}
//			com[i]=su;
//		}
		//사용자 입력
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

			}
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
			if(s==3)
			{
				System.out.println("승리!!");
				break;
			}
		}
	}

}
