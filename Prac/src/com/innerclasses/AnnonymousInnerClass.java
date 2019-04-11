package com.innerclasses;

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> System.out.println("hi"));
		thread.start();
	}
}
