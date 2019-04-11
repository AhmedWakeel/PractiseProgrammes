package com.test;

public class MainClosure {

	public static void main(String[] args) {
		
		int i = 30; 
		int y = 40;
		
		doChane(i,x -> System.out.println(x+y));
	}

	private static void doChane(int y, ClosureInterface closureInterface) {
		
		closureInterface.mk(y);
		
	}
}
