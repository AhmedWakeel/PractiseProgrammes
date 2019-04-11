package com.inter;

public class Class1 {

	public void show()
	{
		System.out.println("inside show method");
	}
	
	static interface Interf1
	{
		public void mk();
	}
}

class Main extends Class1 implements  Class1.Interf1
{
	public static void main(String[] args) {
		
		Class1 main = new Main();
		((Interf1) main).mk();
	}

	@Override
	public void mk() {
		// TODO Auto-generated method stub
		
	}
}