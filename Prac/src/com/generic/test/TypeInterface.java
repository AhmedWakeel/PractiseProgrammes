package com.generic.test;

public class TypeInterface implements Intr<MM> {

	
}

interface Intr<MM>
{
	
}

class MM
{
	
}

class A<String ,Integer,P>
{
	A(String string,Integer integer,P p)
	{
		System.out.println(string);
		System.out.println(integer);
		System.out.println(p);
	}
	A()
	{
	}
}
class B<F, String, X> extends A<String,F,X>
{
	B(F t,String x,X l)
	{
		super(x,t,l);
		
	}
	
	
	/*public static void main(String[] args)
	{
		B<String,Integer,StringBuffer> b = new B<>("hi",33,new StringBuffer("jj"));
	}*/
}