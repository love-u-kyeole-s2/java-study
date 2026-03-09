/*
 * 
 * 	대입연산자 => 우선순위 마지막
 * 	-----------------------
 * 			=
 * 			int a=10 10을 a에 대입
 * 
 * 	복합대입연산자
 * 		+= ,-=,*=,/=,>>-,<<=,&=
 * 		|=,^=
 * 
 * 	1. 형변환
 * 		int a='A'; ==> a=65
 * 		double d=10=> d=10.0
 * 		------
 * 		왼쪽>=오른쪽 왼쪽값이 오른쪽값보다 크거나같아야한다 아니면 오류남 
 *  	-----------
 *  	int a=10L ->이건 오류나는코드
 *  		=> long l=10l;
 *  		=> int a=(int)10L;
 *  		byte b=10;
 *  ------------------
 *  	char c='A' ==> char c=65
 *  -----------------
 *  	2.초기값/ 계산 결과값 저장
 *  		int a=10;
 *  		int b=20;
 *  		int c=a+b;
 *  	3. 기본 (초기값)
 *  		--------
 *  		int a=0;
 *  		double d=0.0;
 *  		char c=''; =''null
 *  		float f=0.0F
 *  		long l =0L
 *  	-----------------------------
 *  		계산결과값 대입
 *  	복합 대입연산자
 *  	===========
 *  	+=	:	++(1증가)
 *  	--- 여러개를 한번에 증가
 *  	int a=10;
 *  	a+=10(+=10->a+10 이라는뜻) ==>a=20
 *  	=>반복문 /값 누적 /문자열 누적
 *  	--------------------
 *  	-= : --(1감소)
 *  	---여러개 동시에 감소 가능
 *  	int a=10;
 *  	a-=5;=>	a=a-5값을저장해라 라는 뜻
 *  	*=
 *  	int a=10;
 *  	a*5======> a=*5 ==>50
 *  	/=
 *  	int a=10;
 *  	a/=3 ==> a=a/3 ==>3
 *  	%=
 *  	int a=10;
 *  	a%=3 a=a%3 ==>1
 *  -----------------------------
 * 		int a=10;
 * 		a<<=3; a=a<<3=> 10<<3
 * 		==>1010000=>80
 * 		int a=10;
 * 		a>>3; a=a>>3=>10>>3====>1010
 * 
 *  	int a=10;
 *  	a&=3 ==> a=a&3
 *  			------
 *  			1010
 *  			0010
 *  			---------
 *  			0010==>2
 *  	int a=10;
 *  	a|3==> a=a|3; ==>+
 *  			1010
 *  			0011
 *  			-----
 *  			1011 ==>11
 *  	int a=10;
 *  	a^=3 ==> a+a^3 => 다른비트1/같은 비트0
 *  			1010
 *  			0011
 *  			----
 *  			1001 ==>9
 *  ---------------------------------------------+=,-= 정도만 나옴 
 *  
 * 
 *  
 *  
 */



public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c=65;
		char d=(char)((int)(Math.random()*26)+65);// 연산처리 결과 =>대입 (char)안넣고 int로만돌리면 오류남 
		System.out.println(d);
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i; //(1~100정수를 누적)
		}
		System.out.println("sum="+sum);
		
		int sum2=0;
		int even=0,odd=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0){
				even+=i;
			}else{
				odd+=i;
				sum+=i;
			}
		}
		System.out.println("짝수합:"+even);
		System.out.println("홀수합:"+odd);
		System.out.println("총합:"+sum2);

		String alpha="";
		for(char e='A';e<'Z';e++){
			alpha=alpha+e;
		}
		System.out.println(alpha);


	}

}
