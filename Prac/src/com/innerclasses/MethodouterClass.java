package com.innerclasses;

public class MethodouterClass {

	private int i = 20;
	 
	public void display()
	{
		int finalData = 23;
		class InnerClass
		{
			private int inner = 34;
			public void invoke()
			{
				System.out.println(i);
				System.out.println(finalData);
				System.out.println();
			}
		}
		new InnerClass().invoke();
	}
	
	public static void main(String[] args) {
		
		MethodouterClass class1 = new MethodouterClass();
		class1.display();
	}
	
}
