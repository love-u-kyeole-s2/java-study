/*
 * 	논리연산자=>결과값은 boolean => 삼항연산자 /조건문 (if)
 * 	-------
 * 		=> 최적화 연산자
 * 		=> 연산기호
 * 			&& => 포함된경우
 * 			|| => 포함이 안된 경우
 * 		(조건)&&(조건)
 * 		------------
 * 		  |		 |
 * 		  --------
 * 			 |
 * 			결과값
 * 
 * 		(조건)||(조건)
 * 		-----  -----
 * 		  |     |
 * 		  -------
 * 			 |
 * 			결과값
 * 
 * 		&& =>직렬
 * 		|| =>병렬
 * 		------------------
 * 				     &&		 ||
 * 		------------------
 * 		ture ture	true	true
 * 		-------------------------------
 * 		true false	false	true
 * 		------------------------------
 * 		false true	false	true
 * 		false false	false	false
 * 		----------------------------
 * 
 * 
 * 
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=9;
		boolean b1=(x>10)&&(++y==x); 
		System.out.println(b1);
		y=9;
		boolean b2=(x>10)||(++y==x); 
		System.out.println(b2);

		y=9;
		boolean b3=(x==10)&&(++y==x); 
		System.out.println(b3);
		y=9;
		boolean b4=(x==10)||(++y==x); 
		System.out.println(b4);
		
		y=9;
		boolean b5=(++y==x)&&(x>10); 
		System.out.println(b5);		y=9;
		boolean b6=(++y==x)||(x>10); 
		System.out.println(b6);
	}

}
