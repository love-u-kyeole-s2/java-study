/*
 * 		byte / long=> 정수
 * |-128~127 |큰데이터값이 있는 경우=>금융권/AI(빅데이터)/학교|
 * => 		int /long 
 * |	  		|100l 100L		
 * 			데이터형
 * 				= 기본형:자바에서 제공하는 데이터형
 * 				= 참조형: 사용자 정의
 * 		급여/점수=>int
 * 		평균/총점=>double
 * 		큰데이터에 작은 데이터형 대입(O)
 * 		작은 데이터에 큰 데이터형 대입(X) <-이건 뭔소리지??
 * 		=========>
 * 				  4byte 8byte 4byte 8byte
 * 		byte <short<int<long<float<double 왜 더큰게 바이트가 더작냐는 물음(모르겠다)
 * 			  char
 *		<========오류
 *
 *		실수 =>
 *		float (4byte)
 *			|F f ==> 10.5f
 *		double(8byte) ==> default 
 * 			----------------class	
 * 

 *   
 */		
public class 변수_3 {
	public static void main(String[] args) {
		byte b1=Byte.MIN_VALUE;
		byte b2=Byte.MAX_VALUE;
		System.out.println("byte는 범위"+b1+"~"+b2);
		
		long l1=Long.MIN_VALUE;
		long l2=Long.MAX_VALUE;
		
		System.out.println("long은 범위:"+l1+"~"+l2);
		
		short s1=Short.MIN_VALUE;
		short s2=Short.MAX_VALUE;
		
		System.out.println("short는 범위: "+s1+"~"+"s2");
		
		int i1=Integer.MIN_VALUE;
		int i2=Integer.MAX_VALUE;
		
		System.out.println("int는 범위: "+i1+"~"+i2);
		
		double d=10.5f;
		//왼쪽이 크거나 같아야함 
		//float f=10.5;<-이건 안됨 
		float f=(float)10.5;//<-(이건됨 왜지;)
		
	}

}
