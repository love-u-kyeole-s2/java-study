/*
 * 1.  국어/수학/영어/총점/평균/학점/등수
 * 	int----------double
 */
public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int drink=12;
		drink-=5;
		System.out.println("남은 음료수:"+drink);
		//남은 음료수:7
		//샌드위치 ==> 250
		//사과 ==>100
		//쥬스 ==> 150
		//샌드위치 1 사과 2 주스 1
		//=> 총 칼로리
		
		int sandcKcal=250;
		int appleKcal=100;
		int juiceKcal=150;
		int sandCount=1;
		int appleCount=2;
		int juiceCount=1;
		int totalKcal=sandcKcal*sandCount+appleKcal*appleCount+juiceCount*juiceKcal;
		
		System.out.println(totalKcal);
/*
 * 	이름은 홍길동 /성별 남자/나이 20
 *  장바구니
 *  	우유 =1200원=>2개 
 *  	빵=1500원=>3개
 *  	계란=200원=>10개
 *  
 *  
 */
		String name="홍길동";
		String sex= "남자";
		int age=20;
		double height=180.5;
		int milk=2;
		boolean isCard=false; //boolean은 is붙임
		int bread=3;
		int egg=10;
		int milkPrice=1200;
		int breadPrice=1500;
		int eggPrice=200;
		
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("나이:"+age);
		System.out.println("키:"+height);
		System.out.println("카드 존재 여부:"+isCard);
		System.out.println("장바구니의 총합:"+(bread*breadPrice+milk*milkPrice+egg*eggPrice));
		
		String msg="100원을 받는 방법은 앱테크, 이벤트 참여, 그리고 100원 웰컴딜 등 다양합니다. 토스 '만보기'나 '이번 주 미션'을 통해 매일 소액을 받을 수 있으며, 100원 이상 가능한 인스타그램 팔로우 앱테크도 활용 가능합니다. 또한, G마켓, 포스티, {Link: U+유모바일 등의 '100원 웰컴딜'이나 경품 이벤트, 교보문고의 e교환권 등을 통해 100원으로 특정 상품을 구매하거나 혜택을 받을 수 있습니다. \r\n";
		System.out.println(msg);
		
		/* String 변수명=""
		 * => 웹 가장 많이 사용되는 데이터형
		 * => 클래스형으로 사용이 가능 => 기능사용
		 * =>문자열 결합
		 * +:산술, 문자열 결합
		 * "Hello"+"Java"=>"Hello Java"
		 * 7+"7"+7=>"777"
		 * 
		 * boolean:존재 여부 =>장바구니에 값 있는지?
		 * 				   =>true/false
		 * 				   =>1byte(0,1)
-------------------------------------------------- 중복여부/로그인여부/턴
		 * =>관리자/일반 유저
		 * boolean bCheck=true/false
		 * 조건문 /반복문에서 주로 사용
		 * => 데이터형의 크기는 사용할 수 없다, 형변환도 안된다
		 * 
		 * 
		 * 
		 * 크기
		 *  byte<short<int<long <float<double
		 *  	char
		 * 	byte/int/long/double
		 * 	String/boolean
		 * ----------
		 *  데이터저장
		 *  데이터형 변수명 = 초기값
		 */
		int a=10;
		int b=20;
		a=b;
		b=a;
		System.out.println(a);
		System.out.println(b);
		
		int c=10;
		int d=20;
		int temp=c;
		c=d;
		d=temp;
		System.out.println(c);
		System.out.println(d);		
		
		
	}

}
