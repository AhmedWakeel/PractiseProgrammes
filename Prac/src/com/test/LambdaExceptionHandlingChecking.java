package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandlingChecking {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(2, 3, 5, 6);
//        int val = 20;
		ls.forEach(callLambda(i -> System.out.println(50 / i)));
		/*Consumer<Integer> c = i -> System.out.println(50 / i);
		callLambda(val,c);*/
	}

	/*private static void callLambda(int i ,Consumer<Integer> c) {

		  c.accept(i);
	}
	*/
	
	
	private static Consumer<? super Integer> callLambda(Consumer<Integer> c) {

		return i -> {
			try {
				c.accept(i);
			} catch (ArithmeticException e) {
				System.out.println("arithmetic is the exception in the " + e.getMessage());
			}
		};
	}
}
