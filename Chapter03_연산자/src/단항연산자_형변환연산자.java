/*
 *  변수=======연산자======제어문
 * 	형변환 연산자
 * 	------------------
 * 		byte<char<int<long<double
 * 			<==========강제 형변환
 * 					   --------- (데이터형)데이터
 * 		=>제외 boolean/String은 제외
 * 						-------- 변환가능
 */
public class 단항연산자_형변환연산자 {
public static void main(String[] args) {
	
	int kor=80;
	int eng=78;
	int math=87;
	
	int count=3;
	
	int total=kor+eng+math;
	double avg=total/count;
	
	System.out.println("총점:"+total);
	System.out.println("평균:"+avg);
	
	int total2=kor+eng+math;
	double avg2=total/(double)count;
	
	System.out.println("총점:"+total2);
	System.out.println("평균:"+avg2);
	
	char c='A';
	System.out.println((int)c);
	int i=65;
	System.out.println((char)i);
	
	int a=123456;
	double d=123456.78;
	int r=(int)((d-a)*100);
	System.out.println(r);

	int q=123456;
	float w=123456.78F;
	int e=(int)(w-q)*100);
	System.out.println(e);
	
}
}
