package com.sist.customer;
import java.awt.*;
import javax.swing.*;
/*
 * 
 * 	윈도우
 * 		***=JFrame: 일반 윈도우
 * 		=JWindow
 * 		***=JPanel=>단독으로 사용할 수 없다
 * 		=>JDialog:JFrame 위 에 다른 윈도우
 * 
 * 	컴포넌트
 * 	=버튼종류
 *  JButton
 *  JCheckBox,JRadioButton
 *  JMenu
 * 	=입력종류
 * 	JTextField =>한줄입력/ID,이름,검색어
 * 	JTextArea=>여러줄입력
 * 	JPasswordField=>암호화
 * 	=목록종류
 * 	JTable/JTree/JList
 *  =기타
 *  JLabel
 * 
 */
public class Login extends JFrame{
	JLabel la1,la2;
	JTextField tf;// 일반문자열
	JPasswordField pf; //비밀번호입력
	JButton b1,b2;
	
	public Login()
	{
		setLayout(null);
		la1=new JLabel("아이디");
		la2=new JLabel("비밀번호");
		
		tf= new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		la1.setBounds(10,15,80,30);
		tf.setBounds(95,15,150,30);
		
		la2.setBounds(10,50,80,30);
		pf.setBounds(95,50,150,30);
		
		add(la1);add(tf);
		add(la2);add(pf);
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		p.setBounds(10,90,235,35);
		add(p);
		
		setBounds(420,270,265,175);
		setVisible(true);
	}
	public static void main(String[] args) {
		
	
		new Login();
	}
}
 
