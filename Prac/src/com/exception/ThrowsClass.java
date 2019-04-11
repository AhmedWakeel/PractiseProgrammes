package com.exception;

import java.io.IOException;

public class ThrowsClass {

	public static void main(String[] args) {
		call();
		/*
			try {
				call();
			} catch (RuntimeException e) {
				System.out.println("wwww "+e.getMessage());
				e.printStackTrace();
			}*/
	}

	private static void call() {
         System.out.println("inside call method");		
//         throw new IOException("FILE IO EXCEPTION");
           throw new RuntimeException("throwing runtimeExceptionwwww");
	}
}
