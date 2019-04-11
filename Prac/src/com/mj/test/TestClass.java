package com.mj.test;

public class TestClass extends A
{

	
}


class A
{
	  int k = 10;
	
	public void mk()
	{
		  int p = 30;
		
	}
	
}

class C
{
	public static void main(String[] args) {
		
		TestClass class1 = new TestClass();
		int k = class1.k;
		System.out.println(k);
	}
}

interface AV
{
	int k = 20;
}