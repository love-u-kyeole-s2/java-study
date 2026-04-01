/*
 * 문자열 분리
 * => split
 * 
 * 	원형
 * 	String[] split(String regex);
 * 						  ㄴ정규식이라는뜻
 * 
 * 	정규식 기호
 * 	|
 * 	.
 * 	?
 * 	*
 * 	+
 * ------------- 정규식 기호기때문에 \\역슬래쉬 두개를 붙여야함
 * 
 * 
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String color="red,green,blue,yellow,black,magenta,pink";
		 String[] colors=color.split(",");
		 for(String c:colors)
		 {
			 System.out.println(c);
		 }
		 System.out.println();
		 color="red|green|blue|yellow|black|magenta|pink";
		 String[] colors2=color.split("\\|");
		 for(String c:colors2)
		 {
			 System.out.println(c);
		 }
	}

}
