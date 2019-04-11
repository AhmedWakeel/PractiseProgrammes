package com.exception;

public class ExceptionChecking {

	public static void main(String[] args) {

		// exception1();
		int callMethod = callMethod();
		System.out.println(callMethod);
	}

	private static int callMethod() {

		try {
			System.out.println("inside try");
			throw new RuntimeException();
		} 
		  catch (Exception e) {
			  System.out.println("inside catch block");
			  return 50;
		}
		finally {
			System.out.println("inside finally block");
			return 20;
		}
	}

	private static void exception1() {
		int a = 0;
		int b = 7;

		try {
			int c = b / a;
			System.out.println("exception after111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("exception after");
	}
}
