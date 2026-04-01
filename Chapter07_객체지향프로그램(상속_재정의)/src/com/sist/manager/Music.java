package com.sist.manager;

public class Music {
	/**
	 * @return the mno
	 */
	public int getMno() {
		return mno;
	}
	/**
	 * @param mno the mno to set
	 */
	public void setMno(int mno) {
		this.mno = mno;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title; //this생략
	}
	//인스턴스 변수 매개변수=>
	//=> 지역변수,매개변수=> 없는 경우 인스턴스 변수에서 찾는다 
	// this는 지역변수/매개변수의 구분
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}
	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the poster
	 */
	public String getPoster() {
		return poster;
	}
	/**
	 * @param poster the poster to set
	 */
	public void setPoster(String poster) {
		this.poster = poster;
	}
	/**
	 * @return the idcrement
	 */
	public int getIdcrement() {
		return idcrement;
	}
	/**
	 * @param idcrement the idcrement to set
	 */
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private String poster;
	private int idcrement;
	//데이터 변경이나 손실을 방지하기위해서 데이터를 은닉화시키는 과정임
	//필요한 경우에 사용이 가능하게=>읽기/쓰기=>getter/setter
	//변수+메소드=>하나로 묶어서 처리 
}
