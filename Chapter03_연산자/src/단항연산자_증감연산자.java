/*
 * 	피연산자가 1개
 * 	증감연산자
 * 		=	전치연산자
 * 		 ++a
 * 			=>증가를 먼저 =>나중에 다른 연산 수행
 * 		=	후치연산자
 * 		 a++
 * 			=>다른 연산  수행 => 증가
 * 		=>정수/문자만 가능
 * 		-----실수 문자열에서는 사용이 불가능
 * 		=> 1증가/1감소
 * 		=>반복문에서 주로 사용
 * 		=>게임=>자동이동
 * 		++/-- ==> 정수형 ( byte, int,long,char)
 * 		!==> boolean(논리형)
 * 		!true=>false
 * 		!false=>true
 * 		==> 범위에 없는 값/예약이 없는 날/로그인이 안 된 사람
 * 		==> 부정연산자
 * 		==> !(score>=0&& score<=100)-> 입력이 잘못된 경우
 * 		==> 턴
 * 
 * 
 */
public class 단항연산자_증감연산자 {
public static void main(String[] args) {
	
	
		 int a=10;
		 int b=a++;
		 System.out.println("a="+a+",b="+b);
		
		 int c=10;
		 int d=++c;
		 System.out.println("c="+c+",d="+d);
		 
		 int e=10;
		 int f=a++ + ++a;
		 System.out.println("e="+e+",f="+f);
		 
		 int g=10;
		 g++;
		 g++;
		 g++;
		 g--;
		 --g;
		 g--;
		 System.out.println("g="+g);

}
}
