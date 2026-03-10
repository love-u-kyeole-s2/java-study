
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
		for(int i=1;i<=10;i++)
		{
			if(i%3!=0)
				System.out.println(i+" ");
		}
		
		for(int i=1;i<=10;i++)
		{
			if(i%3==0&&i%2==0)
				System.out.print(i+" ");
		}
	}
// while=> 데이터베이스 연동시에 주로 사용 크롤링(사이트에 데이터를 가지고 오는 경우)data.go.kr 관광공사
	// 배열 컬렉션(데이터모음) 처리시에 많이사용
	// 모든 언어 : 자바/자바스크립트 => 인덱스는 0번부터/오라클은 1번부터
	// 
}
