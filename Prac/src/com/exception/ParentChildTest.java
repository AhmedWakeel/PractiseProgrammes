package com.exception;

public class ParentChildTest {

	public static void main(String[] args) {

	/*	A2 a2 = new A2(10);
		A2 a22 = new A2();
		B2 b2 = new B2(20, 30);
		B2 b22 = new B2();
		// a2.disp();
		 a22.disp();
		// b2.disp();
//		b22.disp();
 */
		A2 a3;
		A2 a2 = new A2(10);
		B2 b2 = new B2(20, 30);
		B3 b3 = new B3(201, 301);
		a3 = b2;
		System.out.println(a3.getClass().getName());
		a3.disp();
		
		
	}
	

}

class A2 {
	static int i;

	public A2(int i) {
		this.i = i;
	}

	public A2() {
	}

	public void disp() {
		System.out.println("in A2 Cons " + i);
	}
}

class B2 extends A2 {
	int j;

	public B2() {
		super();
	}

	public B2(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public void disp() {
		System.out.println("in B2 Cons " + j);
	}
}

class B3 extends A2 {
	int j;

	public B3() {
		super();
	}

	public B3(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public void disp() {
		System.out.println("in B2 Cons " + j);
	}
}
