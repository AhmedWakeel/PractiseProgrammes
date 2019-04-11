package com.staticchecking;

@FunctionalInterface
public interface FunctionalInterfaceExample {

	void mk(int i);
}

class MainImpFuncationalInterface {
 
	int p =80;
	public void loc() {

		int p = 30;

		 imp(30, x ->System.out.println(p));

/*		imp(30, new FunctionalInterfaceExample() {

			@Override
			public void mk(int i) {

				System.out.println(p);
				System.out.println(this);
			}
		});*/
	}

	public static void main(String[] args) {

		new MainImpFuncationalInterface().loc();

		/*
		 * int i = 30; int k = 40;
		 * 
		 * 
		 * MainImpFuncationalInterface.imp(i , x -> {
		 * 
		 * System.out.println(x+k); // System.out.println(this); });
		 * 
		 * 
		 * imp(i, new FunctionalInterfaceExample() {
		 * 
		 * @Override public void mk(int i) { // k =300; System.out.println(i +
		 * k); System.out.println(this); } });
		 */
	}

	private static void imp(int x, FunctionalInterfaceExample o) {
		o.mk(x);
	}
}