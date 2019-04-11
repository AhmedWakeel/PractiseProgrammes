package com.inner.classes;

public class OutClass {
     int x = 44;
	class InnerClass
	{
		int x = 434;
		public void  sk() {
			int x = 55; 
         System.out.println("in sk method "+x);			
         System.out.println("in sk method "+this.x+" "+InnerClass.this.x);			
         System.out.println("in sk method "+OutClass.this.x);			
		}
		
	}
	public void innerCall() {
		InnerClass class1 = new InnerClass();
		class1.sk();
		
	}
	public static void main(String[] args) {
		
		/*InnerClass class1 = new InnerClass();
		InnerClass.Outer outer = class1.new Outer();
		outer.sk();*/
		
//		new OutClass().new InnerClass().sk();
		
		OutClass class1 = new OutClass();
//		System.out.println(new OutClass().x);
		class1.innerCall();
	}
}

















