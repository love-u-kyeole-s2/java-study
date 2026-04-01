package com.sist.commons;
import java.awt.*;
import javax.swing.*;
/*
 * 
 * 1. class 멤버변수 사용
 * 		=> 기본형
 * 	  ----------------
 * 		=> 클래스
 * 		=> 배열 	=>참조 데이터형
 * 	  ----------------데이터형
 * 2. class
 * 	=데이터형의 사용: 필요한 변수를 모아서 저장
 *  ~VO/~DTO/~Bean-JSP/~Entity--JPA
 *  	----Mybatis
 *  -- Spring(☆☆☆☆☆☆)
 *  캡슐화: private + getter/setter
 * 	=메소드만 모아서 저장 :액션 클래스
 * 	~DAO	/~Manager						/~Service
 * ㄴDB연동	ㄴ크롤링/파일읽기등 외부에서 읽어오기		ㄴ웹이나 윈도우에 값을보낼때
 */
public class ImageChange {

	public static Image getImage(ImageIcon icon, int w,int h)
	{
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
