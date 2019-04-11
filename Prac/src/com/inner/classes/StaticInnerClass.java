package com.inner.classes;

public class StaticInnerClass {

	static class StaticInner
	{
		public void	mk() {
           
			System.out.println("in the static method class ");
		}
		public static void main(String[] args) {
			
			new StaticInner().mk();
		}
	}
	public static void main(String[] args) {
		
		StaticInner inner = new StaticInner();
		inner.mk();
	}
}
//compile  javac StaticInnerClass.java and run java StaticInnerClass
//run      java StaticInnerClass$StaticInner
class OuterClass
{
	public static void main(String[] args) {
		
		StaticInnerClass.StaticInner inner = new StaticInnerClass.StaticInner();
		inner.mk();
	}
}