import java.io.FileReader;
package com.sist.movie
public class MovieSystem {
	
	static Movie[] movies=new Movie[1938];
	//초기화=> 파일을 읽어서 데이터를 저장
	static
	{
		try
		{
			StringBuffer sb=new StringBuffer();
			//파일 전체의 문자 저장
			//1. 파일 읽기
			FileReader in=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=in.read())!=-1)
			{
				sb.append((char)i);
			}in.close();
			String strMovie=sb.toString();
			String[] datas=strMovie.split("\n");
			for(String m:datas)
			{
				String[] mm=m.split("\\|");
				movies[i]=new Movie();
				movies[i].mno=Integer.parseInt(mm[0]);
				//문자열 =>정수형 변경
				movies[i].title=mm[1];
				movies[i].genre=mm[2];
				movies[i].poster=mm[3];
				movies[i].actor=mm[4];
				movies[i].regdate=mm[5];
				movies[i].grade=mm[6];
				movies[i].director=mm[7];

				i++;
				
			}
		}catch(Exception ex) {}
	}

}
