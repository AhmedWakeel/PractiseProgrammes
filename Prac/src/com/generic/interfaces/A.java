package com.generic.interfaces;

public class A extends B{

	public static void main(String[] args) {
		
		B obj= new B();
		obj.mk();
	}
}

class B
{
	void mk()
	{
          System.out.println("Hi");		
	}
}