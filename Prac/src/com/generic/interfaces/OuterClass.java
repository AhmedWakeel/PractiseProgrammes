package com.generic.interfaces;

public class OuterClass {

	private static int  data = 50;
	private static void  pr() {
		System.out.println("inside private pr method "+data);
	}
	
	static class InnerClass
	{
		private int data = 40;
		private void innerPr() {
			pr();
			System.out.println("inside inner private method "+data);
		}
	}
	
	public static void main(String[] args) {
		
//		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
//		innerClass.innerPr();
		
		InnerClass innerClass = new InnerClass();
	}
}
