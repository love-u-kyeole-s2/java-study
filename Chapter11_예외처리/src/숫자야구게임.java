import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface rand{
	public void rand(int[] com);
}
public class 숫자야구게임 extends JFrame implements ActionListener, rand{

	// 힌트
	JTextArea ta=new JTextArea();
	JTextField tf=new JTextField();
	JButton start=new JButton("시작");
	JButton end=new JButton("종료");
	
	public 숫자야구게임()
	{
		JScrollPane js=new JScrollPane(ta);
		JPanel p=new JPanel();
		p.add(tf);p.add(start);p.add(end);
		ta.setEditable(false);
		tf.setEnabled(false);
		add("Center",js);
		add("South",js);
		setSize(350,400);
		setVisible(true);
		
		start.addActionListener(this);
		end.addActionListener(this);
		tf.addActionListener(this);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 숫자야구게임();

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==end)
		{
			JOptionPane.showMessageDialog(this,"프로그램 종료!!");
			System.exit(0);
		}
		else if(e.getSource()==start)
		{
			JOptionPane.showMessageDialog(this,"야구게임을 시작합니다!!");
			tf.setEnabled(true);
			tf.requestFocus();
			start.setEnabled(false);
		}
	}
	@Override
	public void rand(int[] com) {
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
	}
	user[0]=input/100;
	user[1]=(input%100)/10;
	user[2]=input%10;

}














































								{if(i==j)
									s++;
								else
									b++;
								}
							}
					}
					String hit=String.format("Input Number: %d,Result:%ds-%dB\n",input,s,b);
					ta.append(hit);
					
					if(s==3)
					{
						
						JOptionPane.showMessageDialog(this, "Game Over!!");
						System.exit(0);
					}
					tf.setText("");
					tf.requestFocus();
					}
					}
					
					}
					