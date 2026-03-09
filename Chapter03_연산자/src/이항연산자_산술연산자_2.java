


public class 이항연산자_산술연산자_2 {

	public static void main(String[] 
rgs) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int d=(int)(Math.random()*100)+1;
		int e=(int)(Math.random()*100)+1;

		/*			-----------------1 =>0.0~0.99 =>100  0.0~99.0
		 * 	  -----2 0~99+1====>1~100
		 * 							  --3
		 * 
		 */
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		double res=(a+b+c+d+e)/5.0; // 기본:나누기는 실수로 나눈다
		System.out.println("결과값"+res);

	}

}
