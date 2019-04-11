package com.generic.interfaces;

public interface InterfaceObjectClassStaticMethod {

	public static boolean equals1(Object o)
	{
		return true;
	}
	public default void  display()
	{
	}
	
//	 boolean equals(Object o);
}

class Main implements InterfaceObjectClassStaticMethod
{
	public static void main(String[] args) {
		
		Main main = new Main();
		main.display();
//		main.equals1(new Object());
	}
}