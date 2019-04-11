package com.straam.creation;

public class Polymorphism {

	public static void main(String[] args) {
		Pa pa;
		Pb pb = new Pb(10);
		Pc pc = new Pc(10);
		
		pa = pb;
		System.out.println(pa.getClass().getName());
		pa.mk();
		
	}
}

interface Pa {
//	int i;

	/*public Pa(int i) {

	}*/

	public void mk(); /*{
		System.out.println("in Pa const");
	}*/
}

class Pb implements Pa {
	public Pb(int i) {
//		super(i);
	}

	public void mk() {

	}
}

class Pc implements Pa {
	public Pc(int i) {
//		super(i);
	}

	public void mk() {

	}
}