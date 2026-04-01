/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 					Throwable
 * 						|
 * 				------------------
 * 				|				 |
 * 			  Error				Exception
 * 									|
 * 							-------------------------------------
 * 							|=>컴파일시							|=>실행시
 * 						 CheckException							|=>상황에 따라 예외처리
 * 							 =>반드시 예외처리						|
 * 						-----------							UnCheckException
 * 						IOException:File						|
 * 						=>java.io							RuntimeException
 * 						SQLException:oracle						|
 * 						=>java.sql							NumberFormatException:정수변환
 * 						MalformedURLException:네트워크				=>Integer.parseInt("A")
 * 						=>java.net								  Integer.parseInt("10")
 * 						=>URL									웹에서 다른 파일로 데이터 전송
 * 						ClassNotFoundException:메모리 할당			------------------------
 * 						=>java.lang								
 * 						InterruptedException:쓰레드 관련
 * 						=>java.lang
 * 						
 * 
 * 
 */
class A{
	
}
class B extends A{
	
}


public class 예외처리_1 {
	String msg;
	public static void main(String[] args) {
//			예외처리_1 a=null;
//			a.msg.substring(2);
		// TODO Auto-generated method stub
//		int[] arr=new int[2];
//		try {
//		arr[0]=10;
//		arr[2]=20;
//		}catch(ArrayIndexOutOfBoundsException ex) {
//		System.out.println(arr[0]);
//		}
//		System.out.println(arr[0]);
			try{
				A a=new A();
			B b=(B)a;}catch(ClassCastException e)
			{
				e.printStackTrace();
			}
	}

}
