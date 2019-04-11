package com.overridingexceptionrules;

public class B extends A {

	@Override
	public void m1() throws Exception
	{
		System.out.println("inside m1() method of class B");
	}
	
	@Override
	public void m2() throws Exception,RuntimeException
	{
		System.out.println("inside m2() method of class B");
	}
}
