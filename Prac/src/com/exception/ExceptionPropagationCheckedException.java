package com.exception;

import java.io.FileNotFoundException;

public class ExceptionPropagationCheckedException {

	public static void main(String[] args) {

		ExceptionPropagationCheckedException checkedException = new ExceptionPropagationCheckedException();
		checkedException.m1();
	}

	private void m1() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			System.out.println("inside FilenotFound");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
         System.out.println("after m2() call");
	}

	private void m2() throws FileNotFoundException {

		m3();
		System.out.println("after m3() call");
	}

	private void m3() throws FileNotFoundException {

		System.out.println("inside m3() method");
		throw new FileNotFoundException("File is not found");
	}
}
