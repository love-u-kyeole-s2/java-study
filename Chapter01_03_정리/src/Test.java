import java.util.Random;
public class Test {
//데이터형이랑 식별자 외우기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		자바 변수 선언 연습문제 10개
//		1번
//		사과 3개를 저장하는 변수를 선언하시오.
		int apple=3;
		System.out.println("사과 개수:"+apple);
//
//		2번
//		연필 5개와 지우개 2개를 변수로 선언하시오.
		int pencil=5;
		int eraser=2;
		System.out.println("연필 개수:"+pencil);
		System.out.println("지우개 개수:"+eraser);

		
//
//		3번
//		학생 수 30명을 저장하는 변수를 선언하시오.
		int students=30;
		System.out.println("학생 수:"+students);

//
//		4번
//		우유 가격 2500원을 저장하는 변수를 선언하시오.
		int milk_price=2500;
		System.out.println("우유 가격:"+milk_price);

//
//		5번
//		키 175.5cm를 저장하는 변수를 선언하시오.
//		(실수형 변수 사용)
		double height = 175.5;
		System.out.println("키:"+height);

//
//		6번
//		이름이 "민수"인 문자열 변수를 선언하시오.
		String name ="민수";
		System.out.println("이름:"+name);

//
//		7번
//		버스 승객 12명과 지하철 승객 20명을 변수로 선언하시오.
		int bus_p=12;
		int subway_p=20;
		System.out.println("버스 승객 수:"+bus_p);
		System.out.println("지하철 승객 수:"+subway_p);

//
//		8번
//		국어 점수 85점, 영어 점수 90점을 변수로 선언하시오.
		double kor=85.0;
		double eng=90.0;
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);

//		9번
//		파이 값 3.14를 저장하는 변수를 선언하시오.
		double pie=3.14;
		System.out.println("파이 값:"+pie);

//
//		10번
//		노트북 1대, 마우스 2개, 키보드 1개를 변수로 선언하시오.
		int notebook=1;
		int mouse=2;
		int keyboard=1;
		
		System.out.println("노트북 개수: "+notebook);
		System.out.println("마우스 개수: "+mouse);		
		System.out.println("키보드 점수:"+keyboard);
//
//		자바 연산자 연습문제 10개
//		1번 (덧셈)
//		정수 5와 3을 더하는 프로그램을 작성하시오.
		int a=5;
		int b=3;
		int result1=a+b;
		System.out.println(result1);
		
//
//		2번 (뺄셈)
//		정수 10에서 4를 빼는 프로그램을 작성하시오.
		int c=10;
		int d=4;
		int result2=c+d;
		System.out.println(result2);

//
//		3번 (곱셈)
//		정수 6과 7을 곱하는 프로그램을 작성하시오.
		int e=6;
		int f=7;
		int result3=e*f;
		System.out.println(result3);

//
//		4번 (나눗셈)
//		정수 20을 4로 나누는 프로그램을 작성하시오.
		int g=20;
		int h=4;
		int result4=g/h;
		System.out.println(result4);

//
//		5번 (나머지 연산)
//		정수 15를 4로 나누었을 때 나머지를 구하시오.
		
		int j=10;
		int k=4;
		int result6=j%k;
		System.out.println(result6);

//
//		6번 (복합 연산)
//		정수 8과 2를 더한 후 3을 곱하는 프로그램을 작성하시오.
		int l=10;
		int m=4;
		int n=3;
		int result7=(l+m)*3;
		System.out.println(result7);
		
//		7번 (증가 연산자)
//		정수 10을 1 증가시키는 코드를 작성하시오.
		int o=10;
		o++;
		System.out.println(o);

//
//		8번 (감소 연산자)
//		정수 10을 1 감소시키는 코드를 작성하시오.
		int p=10;
		p++;
		System.out.println(p);
//
//		9번 (비교 연산자)
//		정수 7이 5보다 큰지 비교하는 코드를 작성하시오.
		boolean big = 7>5;
		System.out.println(big);
//
//		10번 (논리 연산자)
//		정수 a=5, b=10 일 때
//		a가 3보다 크고 b가 20보다 작은지 확인하는 코드를 작성하시오.
		int A=5; int B=10;
		if(a>3)
		{
			System.out.println("A는 3보다 큽니다.");
		}
		else
		{
			System.out.println("A는 3보다 크지 않습니다");
		}
		if(b<20)
		{
			System.out.println("B는 20보다 작습니다.");
		}
		else
		{
			System.out.println("B는 20보다 작지않습니다.");
		}
//
//		자바 조건문 연습문제 10개
//		1 if문
//		1번
//		정수 num이 10보다 크면 "10보다 큽니다" 를 출력하시오.
		int num=(int)(Math.random()*101);
		System.out.println(num);
		if(num>10)
		{	
			System.out.println(num+"은(는) 10보다 큽니다");
		}
//
//		2번
//		정수 score가 60점 이상이면 "합격" 을 출력하시오.
		
		int score=(int)(Math.random()*101);
		if(score>=10)
			System.out.println("점수: "+score);
		{
			System.out.println("합격하셨습니다.");

		}
//
//		3번
//		정수 age가 20세 이상이면 "성인입니다" 를 출력하시오.
		
		int age=(int)(Math.random()*101);
		if(age>=20)
		{
			System.out.println("나이: "+age);
			System.out.println("성인입니다.");

		}else
		{
			System.out.println("나이: "+age);
			System.out.println("미성년자입니다");
		}
//
//		2 if ~ else
//		4번
//		정수 num이 짝수이면 "짝수", 아니면 "홀수" 를 출력하시오.
		int num2=(int)(Math.random()*101);
		if(num2%2==0)
		{
			System.out.println(num2+"는 짝수입니다.");

		}else
		{
			System.out.println(num2+"는 홀수입니다.");
		}

		
//
//		5번
//		정수 score가 60점 이상이면 "합격", 아니면 "불합격" 을 출력하시오.
		
		int score2=(int)(Math.random()*101);
		if(score2>=60)
		{
			System.out.println("점수: "+score2);

			System.out.println("합격");

		}else
		{
			System.out.println("점수: "+score2);

			System.out.println("불합격");		
		}
//
//		6번
//		정수 temperature가 30도 이상이면 "덥다", 아니면 "덥지 않다" 를 출력하시오.
//
		int temperature=(int)(Math.random()*101);
		if(temperature>=30)
		{
			System.out.println("온도: "+temperature);

			System.out.println("덥다");

		}else
		{
			System.out.println("온도: "+temperature);

			System.out.println("덥지않다");		
		}
//		3 다중 조건문 (if ~ else if ~ else)
//		7번
//		점수 score에 따라 다음을 출력하시오.
//		90 이상 → A
//		80 이상 → B
//		70 이상 → C
//		그 외 → D
		
		int score3=(int)(Math.random()*101);
		if(score3>=90)
		{
			System.out.println("점수: "+score3);
			System.out.println("성적: "+A);

		}
		else if(score3>=80)
		{
			System.out.println("점수: "+score3);
			System.out.println("성적: B");
		}
		else if(score3>=70)
		{
			System.out.println("점수: "+score3);
			System.out.println("성적: C");
	
		}
		else
		{
			System.out.println("점수: "+score3);
			System.out.println("성적: D");	
		}
//
//		8번
//		정수 num이
//		0보다 크면 → "양수"
		
		int num3=(int)(Math.random()*101);
		if(num3>0)
		{
			System.out.println(num3+"은(는) 양수");

		}
		else if(num3==0)
		{
			System.out.println(num3);
		}
		else
		{
			System.out.println(num3+"은(는) 음수");
		}

//		9번
//		나이 age에 따라 출력하시오.
//		13세 이하 → 어린이
//		14~19세 → 청소년
//		20세 이상 → 성인

		int age2=(int)(Math.random()*101);
		if(age2>=20)
		{
			System.out.println("나이:"+age);
			System.out.println("성인입니다.");

		}
		else if(14<=age2&&age2<19)
		{
			System.out.println("나이:"+age);
			System.out.println("청소년입니다.");		
		}
		else
		{
			System.out.println("나이:"+age);
			System.out.println("어린이입니다.");				
		}
		
//		10번
//		정수 num이
//		10보다 크면 → "10보다 큼"
//		10이면 → "10과 같음"
//		10보다 작으면 → "10보다 작음"

		int num4=(int)(Math.random()*101);
		if(num4>10)
		{

			System.out.println(num4+"는(은) 10보다 크다.");		

		}
		else if(num4==10)
		{
			System.out.println(num4+"는(은) 10과 같다");		
		
		}
		else
		{
			System.out.println(num4+"는(은) 10보다 작다.");		
			
		}
		
	}

}
