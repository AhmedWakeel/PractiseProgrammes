package com.innerclasses;

public class OuterClass {

	private String OuterName = "ahmed";
	
	class InnerClass {
		private String innerName = "malik";
		public void invoke()
		{
			System.out.println("inside of inner class");
//			display();
			OuterClass.this.display();
		}
		
		public void display()
		{
			System.out.println("inside the disp method of innerClass");
		}
		
	}

	public void display() {
		 int i;
		System.out.println("outer class display method is called");
		InnerClass class1 = new InnerClass();
		System.out.println(class1.innerName);
		
	}
}
