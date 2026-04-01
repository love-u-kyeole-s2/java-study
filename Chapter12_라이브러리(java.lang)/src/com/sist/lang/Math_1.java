package com.sist.lang;
//수학연산과 관련된 클래스
//Math =>ceil() random(),round()
						//반올림
			//  double(0.0~0.99)
		//올림=>총페이지
//오라클 안에도 존제 select ceil(count(*)/10) FROM emp
//Math=>only static
//라이브러리 => 메소드 사용하면됨(오로지 기능!)
//=>원형/예외처리
// 리턴형 메소드명()매개변수)=>예외처리여부
//double random() => Math.random()
public class Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"aaa","bbb","ccc","ddd",
				"eee","fff","iii","jjj",
				"kkk","mmm","nnn","ppp","www",
				"xxx","yyy"};
		System.out.println((int)Math.ceil(names.length/5.0));
		
		int rand=(int)(Math.random()*100);
		System.out.println(rand);
		double d=Math.round(10.12);
		System.out.println(d);
		
		}
	}


