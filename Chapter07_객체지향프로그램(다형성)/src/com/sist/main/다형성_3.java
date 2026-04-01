package com.sist.main;

import java.util.Scanner;

public class 다형성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴 입력(1,2,3,4):");
		int menu=scan.nextInt();
		Container c=new Container();
		AA aa=c.getBean(menu);
		aa.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			ㅡㅡ
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		else if(menu==2)
	{
		BB bb=new BB();
		bb.display();
	}
	else if(menu==3)
	{
		CC cc =new CC();
		cc.display();
	}
	else if(menu==4)
	{
		DD dd=new DD();
		dd.display();
	}
	}

}
