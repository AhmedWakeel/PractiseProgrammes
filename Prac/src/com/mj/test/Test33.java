package com.mj.test;

public class Test33<T extends Number & Runnable> {
	
	
}

class MainTest
{
	public static void main(String[] args) {
		
		Test33<Ttt> test33 = new Test33<Ttt>();
	}
	
}


class Ttt extends Number implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

interface Int3
{
	
}

class Cls implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
interface Int4 extends Int3
{
	
}