/*
 * 1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트
 * =>영화 한개에 대한 정보=>저장하기 위한 데이터형
 * 	MovieDTO/MovieVO/MovieBean/MovieEntity
 * 	web		 Spring		JSP		JPA
 * 	데이터형 클래스: 변수만 가지고 있는 클래스
 * 	액션클래스 => 기능수행(메소드)
 * 	MovieDAO/MovieManager/MovieService
 * 	|DB연동		|크롤링		|브라우저에 전송
 */	
public class Movie {
	//데이터를 여러명이 동시에 접속=> 같은 영화정보=>공유
	int mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}
