package com.parent;

public class B  extends A{

	public void m1(String s)
	{
		System.out.println("in string of B m1");
		m1(10);
	}
	/*public void m1(int i )
	{
		System.out.println("in int m1 of B");
	}*/
}
