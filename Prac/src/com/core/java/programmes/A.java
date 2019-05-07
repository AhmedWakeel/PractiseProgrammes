package com.core.java.programmes;

public class A {
 
//	public final void m1()
	private  void m1()
	{
		System.out.println("in the m1");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("in the m1 of class B child");
	}
	public static void main(String[] args)
	{
		B b = new B();
		A a = new A();
//		A b = new B();
//		a.m1();
		b.m1();
	}
}

/*Key points:
The overriding concept is not applicable to the private method. Parent class private method is not visible in the child class. Keep in mind. Based on our requirement, we can define exactly the same private method in the child class. The code is valid but not overriding.*/


/*Key points:
If the parent class method is declared as final, you cannot override it in the child class. If you are trying to override it, you will get the compile-time error-"Overridden method is final*/


 class A1 {
	  protected void m1(){
	   System.out.println("m1-A1");
	  }
	}
	 class B1 extends A1{
	 public final void m1(){
	   System.out.println("m1-B1");  
	    }
	public static void main(String[] args) {
	  B1 b=new B1();
	   b.m1();
	  A1 a=new B1();
	    a.m1();
	 }
	}
	 
/*Key points:
You cannot declare the parent class method as final but the child class method can be declared as final. It is used to restrict further overriding.
a. When b.m1() will be executed, it will call m1() of class B because the reference variable 'b' is pointing to the objects of class B. So, the output will be "m1-B".
b. Since 'a' is also pointing to the objects of class B. Therefore, the output will be "m1-B".
You can get more detail reason in this tutorial- Method overriding in Java.*/
	 
	 
	 
	 
	 
	 