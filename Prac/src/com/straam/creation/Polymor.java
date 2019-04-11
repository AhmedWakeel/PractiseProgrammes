package com.straam.creation;


public class Polymor {

	public static void main(String[] args) {
		Pa1 pa;
		Pb1 pb = new Pb1(10);
		Pc1 pc = new Pc1(10);
		
		pa = pb;
		System.out.println(pa.getClass().getName());
		pa.mk();
		
		int i = 33;
		new Pa1(33).sk(i);
	}
}

class Pa1 {
	int i;

	/*public void sk(long l)
	{
		System.out.println("in long");
	}*/
	/*public void sk(float l)
	{
		System.out.println("in float");
	}*/
	public void sk(double l)
	{
		System.out.println("in double");
	}
	
	public  Pa1(int i) {

	}

	public  void mk() {
		System.out.println("in Pa const");
	}
}

class Pb1 extends Pa1 {
	public Pb1(int i) {
		super(i);
	}

	public void mk() {
		System.out.println("in pb1 const");
	}
}

class Pc1 extends Pa1 {
	public Pc1(int i) {
		super(i);
	}

	public void mk() {
		System.out.println("in pc1 const");
	}
}