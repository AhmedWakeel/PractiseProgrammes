package com.stream.winterbe;

public class Test33 {

	static boolean b1;

	public boolean bol() {
		return b1;
	}

	Test33(boolean b) {
		this.b1 = b;
	}

	public static boolean mk(Boolean b) {
		b1 = b;
		return b;
	}

	public static void main(String[] args) {

		Boolean b = new Boolean(true);

		Boolean mk = mk(true);
		System.out.println(mk);
		int k = 49;
		if(k>4 && !mk.booleanValue())
		{
		System.out.println(!mk.booleanValue());
		}
	}
}
