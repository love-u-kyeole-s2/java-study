/*
 * 
 * 	생성자 선언	=>모든 클래스에서 제작하는 것은 아님
 * 			 	=>필요한 경우에만
 * 
 * 
 * 
 * 
 */
class Student
{
	int hakbun;
	String name;
	int kor,eng,math;
	//변수값을 다르게 저장, 초기값을 다르게 생성 
	Student(int h,String n,int k,int e, int m)
	{
		hakbun=h;
		name=n;
		kor=k;
		eng=e;
		math=m;
	}
	Student(int hakbun,String name)
	{
		//지역변수 우선순위
		System.out.println("this:"+this);
		this.hakbun=hakbun;
		// this=>자신의 객체명=>lee
		/*
		 * 	객체 생성
		 * 	=> Student s = new Student(1,"심청이")
		 * 		1) 
		 * 			---s---
		 * 			100==> .=>s.hakbun
		 * 			------- 100 --------hakbun
		 * 						1
		 * 						-------name=>s.name
		 * 						"심청이"
		 * 						-------
		 * 		2) this=s;
		 * 		  ----- 모든 클래스는 this를 가지고 있다
		 * 		  ----- 실행시마다=>this의 주소가 변경이된다
		 * 		  ----- static Object this this는 static으로 돼있다 
		 *		3)this는 멤버에서만 사용이 가능
		 *			=>static은 this가 존재하지 않는다 
		 */
		this.name=name;
	}
	/*
	 * 	변수 찾기
	 * 	=>지역변수
	 * 	=>인스턴스변수 찾기
	 * 
	 */
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student(1,"홍길동",90,90,90);
		Student shim=new Student(2,"심청이",95,98,100);
		Student park=new Student(3,"박문수",70,70,70);
		System.out.print(hong.hakbun+" "+hong.name+" "+hong.kor+" "+hong.eng+" "+hong.math);
		System.out.print(shim.hakbun+" "+shim.name+" "+shim.kor+" "+shim.eng+" "+shim.math);
		System.out.print(park.hakbun+" "+park.name+" "+park.kor+" "+park.eng+" "+park.math);

		Student lee=new Student(4,"이순신");
		System.out.println("학번:"+lee.hakbun);
		System.out.println("이름:"+lee.name);
		System.out.println("lee"+lee);
	}
	

}
