//0~9 난수 발생 ==> 100개발생
//AI
//빅데이터==>예측(AI)
import java.util.Arrays;

public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for(int i=1; i<=100;i++)
		{
			int rand=(int)(Math.random()*10);//0~9
			arr[rand]++;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"==>"+arr[i']);
		}
	}

}
