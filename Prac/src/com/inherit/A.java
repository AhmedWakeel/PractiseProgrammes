package com.inherit;

public class A extends B{

	@Override
	public  void m1()
	{

		System.out.println("in the A class");
	}
	public static void main(String[] args)
	{
		C a = new A();
		a.m1();
	}
}
