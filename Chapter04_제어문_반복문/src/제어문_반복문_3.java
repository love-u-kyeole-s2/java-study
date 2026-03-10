/* 
 *
 *	1~100 합==> 1~100 누적
 *			   -----------sum 반드시 초기값 0
 *	----------
 */

public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 누적변수
		int sum=0;
		for(int i=1;i<=100;i++)
		{	//i는 지역변수 =>for 안에서만 사용이가능
			System.out.println("i="+i+",sum="+sum);
			sum+=i; //sum=sum+i;
			//장바구니계산
		}
		//지역변수는 {}을 벗어나면 사라진다
		// 지역변수는 반드시 초기값이 존재
		//같은 블록에서 같은 변수명을 사용할수 없다
		System.out.println("1~100사이의 총합: "+sum);
	}

}
