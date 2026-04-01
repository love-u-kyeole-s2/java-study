
public class 예외처리_3 {
	public static void main(String[] args) {
		 System.out.println("Start");
		 System.out.println("2");

		 try
		 {	 System.out.println("3");
		 System.out.println(Integer.parseInt("10 "));
		 System.out.println("5");
		
		 }catch(ArithemeticException e)
		 {
		
		 }
		 finally
		 {
			 System.out.println("6");
		 }
	}
}
