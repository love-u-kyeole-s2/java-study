import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 제어문_다중조건문_1 {
	public static void main(String[] args) throws Exception{
		
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴선택(가요(1) POP(2) OST(3) 트롯(4) JAZZ(5) Classic(6)");
		int menu=scan.nextInt();
		String baseurl="https://www.genie.co.kr/chart/genre";
		String url="";
		if(menu==1) url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0100";
		else if(menu==2) url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0200";
		else if(menu==3) url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0300";
		else if(menu==4) url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0107";
		else if(menu==5) url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0500";
		else if(menu==6) url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=M0600";
		else System.out.println("없는 메뉴입니다!");
		
		System.out.println(baseurl+url);
		Document doc=Jsoup.connect(url).get();
		
		Elements title=doc.select("table.list-wrap a.title");
		for(int i=0;i<title.size();i++)
		{
			System.out.println((i+1)+"."+title.get(i).text());
		}

	}

}
