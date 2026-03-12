// 10개의 정수를 임의로 추출=>배열
// 최대값/최소값 구하기 
// index => 위치, 검색
import java.util.*;
public class 배열_5 {
	public static void main(String[] args) {
	int[] arr=new int[10];
	Random r=new Random();
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=r.nextInt(100)+1;
	}
	for(int i:arr)
	{
		System.out.print(i+" ");
		
	}
	System.out.println("\n======결과값======");
	
	int max=arr[0];
	int min=arr[0];
	for(int i:arr)
	{
		if(max<i)
			max=i;
		if(min>i)
			min=i;
	}
	System.out.println("최대값:"+max);
	System.out.println("최소값:"+min);
	for(int i=0; i<arr.length;i++)
	{
		if(arr[i]==max)
			System.out.println(max+"는(은) "+(i+1)+"번째입니다.");
		if(arr[i]==min)
			System.out.println(min+"는(은) "+(i+1)+"번째입니다.");
	}
}
}
