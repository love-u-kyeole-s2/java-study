import java.io.*;
import java.util.StringTokenizer;
public class 영화데이터 {
	static String[] rank=new String[1938];
	static String[] title=new String[1938];
	static String[] genre=new String[1938];
	static String[] poster=new String[1938];
	static String[] actor=new String[1938];
	static String[] director=new String[1938];
	static String[] regdate=new String[1938];
	static String[] grade=new String[1938];

	static
	{
		try {
				FileReader in=new FileReader("C:\\javaDev\\movie.txt");
				//파일
				StringBuffer sb=new StringBuffer();
				int i=0; // => 파일 읽기=> 한글자=>정수=>한글자씩 읽어오는 변수
				while((i=in.read())!=-1)
				{
					sb.append((char)i);
				}
				in.close();
				//System.out.println(sb.toString());
				String[] movie=sb.toString().split("\n");
				for(i=0;i<movie.length;i++)
				{
					String m=movie[i];
					StringTokenizer st=new StringTokenizer(m,"|");
					rank[i]=st.nextToken();
					title[i]=st.nextToken();
					genre[i]=st.nextToken();
					poster[i]=st.nextToken();
					actor[i]=st.nextToken();
					director[i]=st.nextToken();
					regdate[i] =st.nextToken();
					grade[i] =st.nextToken();
				}
		}catch(Exception ex) {}
	}
}
