package com.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {

		ExceptionPropagation exceptionPropagation = new ExceptionPropagation();

		exceptionPropagation.m1();
	}

	private void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("inside catch block");
			System.out.println("get" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("after catch block in m1 method");
	}

	private void m2() {
		m3();
		System.out.println("afer m3() method call");
	}

	private void m3() {
		System.out.println("inside m3 method");
		int c = 10 / 0;
		System.out.println("after int c");
	}
}
