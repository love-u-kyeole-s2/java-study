package com.sist.inter;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

//다중상속=>메소드명이 충돌이 안되게 만들어라
interface A
{
	public void aaa();
}
interface B
{
	public void bbb();
}
interface D
{
	public void bbb();
}
class C implements A,B,D// 다중상속 =>메소드명이 동일할경우 하나로통일=>사용불가
{
@Override
public void bbb(){
	System.out.println("bbb method call...");
}

@Override
public void aaa(){
	System.out.println("aaa method call...");
}
	
}
public class 인터페이스_3 extends JFrame implements KeyListener,MouseListener,ActionListener,FocusListener,{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
