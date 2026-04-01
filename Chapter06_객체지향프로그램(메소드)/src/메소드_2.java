/*
 * 매개변수
 * 전송===>전송법
 * Call by Value /	Call by Reference
 * 	복사본				 원본
 * 	=>일반				=>가끔
 * 
 */
// 	같은 메모리 주소를 이용하면 =>값을 같이 제어
//	---------------배열/클래스(String=>call by value)
class CallByValue
{
	void swap(int a, int b) 
	{
		System.out.println("변경전: a="+a+",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후:a="+a+",b="+b);
	}
	void swap2(String s1,String s2)
	{
		System.out.println("변경전: s1="+s1+",b="+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("변경후: s1="+s1+",b="+s2);

	}
}
class CallByReference
{
	void swap(int[] arr)
	{
		System.out.println("수행 전 arr[0]="+arr[0]+",arr[1]"+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("수행 후 arr[0]="+arr[0]+",arr[1]"+arr[1]);

	}
}

class Test
{		int a=10;

	void display() {
		System.out.println("Test: dispaly Call...");
		System.out.println("a="+a);
		a++;
	}
}
public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue call=new CallByValue();
		int a=10;
		int b=20;
		call.swap(a,b);
		System.out.println("수행후 원본:a="+a+",b="+b);
		//모든 클래스와 배열은==>Call By Reference
		//String만 Call By Value 수행
		String s1="홍길동";
		String s2="심청이";
		System.out.println("수행전: s1="+s1+",b="+s2);
		call.swap2(s1, s2);
		System.out.println("수행후: s1="+s1+",b="+s2);
		CallByReference cr=new CallByReference();
		int[] arr= {10,20};
		cr.swap(arr);
		System.out.println("수정 후 원본: arr[0]="+arr[0]+",arr[1]="+arr[1]);
		new Test().display();//한 번 사용 얘네는 증가안됨
		new Test().display();
		new Test().display();

		Test t=new Test();//연속해서 사용=>객체 주소 저장. 얘네는 증가 됨
		t.display();
		t.display();
		t.display();
		t.display();

	// 생성자는 반드시 =>new 동반 

	}
	/*
	*	int[] rand(int[] arr)
	*	{
	*		return
	*	}
	* void rand(int[] arr)
	* {
	* 	변경
	* }
	*/

}
