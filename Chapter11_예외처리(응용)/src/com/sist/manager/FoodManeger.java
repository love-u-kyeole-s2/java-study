package com.sist.manager;
/*
 * 
 * 	1.데이터형 
 * 		=기본형
 * 			정수(int).....
 * 			
 * 		=참조형
 * 			클래스, 배열 => 주소를 이용한 방식
 * 			---- 자바 라이브러리 클래스/사용자 정의
 * 			클래스 1개는 1개 맛집에 대한 정보를 가지고 있다.
 * 		2. 데이터 공유
 * 			=> 모든 사용자가 같은 데이터를 사용=>공유
 * 				=>static:오라클 (데이터베이스=>공유된 데이터)
 * 		3. 모든 클래스에서 접근이 가능 => public
 * 		   모든 변수는 private이 아니다=>선택적이다
 * 		4. 초기화 => 값을 저장 
 * 			1) 명시적 초기화 int a=10
 * 			2) 초기화 블록
 * 			   인스턴스 {}
 * 			   정적 static{}
 * 			   생성자
 * 			   =>클래스 {} 은 선언만 가능
 * 				=>파일읽기(X)
 * 			  ** static변수 =>static{}
 * 			  ** 인스턴스는 =>생성자()
 * 			  ------------------------ 상속예외
 * 
 * 초기화=>배열값 저장
 * 				
 * 
 * 				
 * 
 */
import java.io.*;
import com.sist.vo.*;
public class FoodManeger {
	public static FoodVO[] foods=new FoodVO[432];
	static
	{ // 구현해서 초기화가 가능=>자동호출
	  // =>파일 읽기=>CheckException=>예외처리
	  // =>초기화 블록은 throws 를 사용할 수 없다
		try
		{
			StringBuffer sb =new StringBuffer();
			//문자열을 모을 수 있는 임시 저장 장소를 가지고 있다.
			// =>문자열 결합 속도가 빠르다
		}catch(Exception ex)
		{}
	}

}
