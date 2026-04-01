package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

class Temp
{
	public void sum(int...value)
	{
		int s=0;
				for(int i=0;i<value.length;i++)
				{
					s+=value[i];
				}
		System.out.println("sum="+s);
	}
}
public String change(int num)
{
	DecimalFormat d=new DecimalFormat("###,###,###");
	return d.format(num);
}
public String dateChamge(Date date)
{
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	return sdf.format(date);
}


public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t=new Temp();
				t.sum(10);
		t.sum(10,20,30,40,50,60,70,80,90);
		int a=1000000000;
		String res=t.change(a);
		System.out.println();
	}

}
