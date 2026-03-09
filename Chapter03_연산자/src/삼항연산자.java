/*
 * 
 * 
 * 
 * 	삼항연산자
 * 		=> 피연산자가 3개인 경우
 * 		=> (조건)?값1:값2 ===> 결과값은 프로그램에 따라 결정
 * 			---------------
 * 		조건:true :값1
 * 			false :값2
 * 			=> 부정연산자/비교연산자/논리연산자
 * 		=>일반프로그램보다 게임/웹에서 주로 사용
 * 					 ---- --
 * 						자바+html(css/html의 버튼)-로그인/댓글
 * 						|소스가 길다
 * 					|if ~else
 * 		<body>
 * 			<% if(login==true)
 * 				{
 * 			%>
 * 			 로그아웃
 * 			<%}
 * 				else
 * 			  {
 * 			%>	로그인
 * 			<%
 * 			  }
 * 			>%
 * 		</body>
 * 		<body>
 * 			<%= login==true?"로그아웃":"로그인 "%>
 * 		</body>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 삼항연산자 {
public static void main(String[] args) {
	
			int num1=(int)(Math.random()*100)+1;
			//1~100사이의 임의의 수를 가지고 온다
			System.out.println("num1="+num1);
			String result=num1%2==0?"짝수":"홀수";
			System.out.println(num1+"는(은) "
					+ ""+result+"입니다.");
			
			int num2=(int)(Math.random()*2);
			char c=num2==0?(char)((int)(Math.random()*26)+65):(char)((int)(Math.random()*26)+97);
			System.out.println("c="+c);
			
			String result2=(c>'A'&&c<'Z')?"대문자":"소문자";
			System.out.println(c+"는(은) "+result2+"입니다");
			
			int num3=(int)(Math.random()*100)+1;
			int num4=(int)(Math.random()*100)+1;
			
			int max=num3<num4?num3:num4;
			int min=num3<num4?num4:num3;
			System.out.println(num3+","+num4);
			System.out.println("큰 수:"+max);
			System.out.println("작은 수:"+min);
			
			int num5=(int)(Math.random()*100)+1;
			String result3=num5%3==0?"3의 배수입니다.":"3의 배수가 아닙니다.";
			System.out.println(num5+"는(은) "+result3);

			
			

}
}
