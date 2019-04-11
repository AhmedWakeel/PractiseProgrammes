package com.generic.collection;

public class SuperChecking extends A1 {

	public  void  mk() {
		super.mk();
		System.out.println("in mk of SuperChecking");
	}
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		new SuperChecking().mk();
	}
}



class A1 extends B1
{
	public   void  mk() {
		super.mk();
		System.out.println("in mk of A1");
	}
}

class B1 
{
	public   void  mk() {
		System.out.println("in mk of B1");
	}	
}