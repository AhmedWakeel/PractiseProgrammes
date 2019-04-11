package com.exception;

public class RethrowException {

	public static void main(String[] args) {

		other();
	}

	private static void other() {
		try {
			RethrowException rethrowException = new RethrowException();
			rethrowException.display();
		} catch (RuntimeException e) {
			System.out.println("inside catch block of main method");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private void display() {

		try {
			throw new RuntimeException("throwing RuntimeExceptioneeee in display");
		} catch (RuntimeException e) {
			System.out.println("inside display method catch block");
			throw e;
		}
	}
}
