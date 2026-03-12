//로또 번호 추출=>6(1~45)==> 중복 없는
import java.util.Arrays;

public class 배열_9 {
//  게임
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
				}
			}
		}
//		System.out.println(Arrays.toString(lotto));
		Arrays.sort(lotto);
		for(int i=lotto.length-1;i>0;i--)
		{
			Thread.sleep(2000);
			System.err.print(lotto[i]+" ");
		}
	}

}
