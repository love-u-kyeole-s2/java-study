/*
 * 1.배열 선언
 * 2.배열 초기화
 * 3.반복문을 이용한 데이터 출력
 * 4. 배열 복사
 * 5. 동적 생성
 * 
 * 1) 선언
 * 		데이터형[] 배열명
 * 		데이터형 배열명[]; c언어 호환
 * 		=>정수
 * 		int[] arr
 * 		=>문자
 * 		char[] arr
 * 		=>문자열
 * 		String[] arr
 * 		=>실수
 * 		double[] arr
 * 		=>논리
 * 		boolean[] arr
 * 
 * 	2) 몇 개?=>초기화
 * 		10 20 30 40 50
 * 		int[] arr={10 20 30 40 50};//선언 초기화
 * 		stack heap
 * 		-arr- ----------------------------
 * 		 100	10	20	30	40	50
 * 		----- 100----------------------------
 * 
 * 				범위를 초과하면 오류 발생
 * 				arr[5] 달라 요청하면 오류발생=>ArrayIndexOutOfBoundsException
 * 
 */
public class 배열_2 {
		public static void main(String[] args) {
			int[] arr= {10,20,30,40,50};
			System.out.println("arr="+arr);
			//[I@5305068a 메모리 주소값 이안에 10 20 30 40 50이 저장된거임
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			System.out.println();

			arr[0]=100;
			arr[1]=200;
			for(int i=0;i<5;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("=======");
			for(int a:arr)//데이터가 모아진 상태 (배열,컬렉션)
						 //배열 실제 저장된값을 가지고 온다(인덱스 번호가 아니다)
						//-> 데이터형 동일/큰데이터형으로 받을 수 있다
			{
				System.out.println(a);
			}
			
		}

}
