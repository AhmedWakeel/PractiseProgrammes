package com.staticchecking;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExceptionHandling {

	public static void main(String[] args)
	{
		List<Integer> asList = Arrays.asList(13,23,34,0,23);
		asList.forEach(x -> System.out.println(11%x));
	}
	
	public static Consumer<Integer> mk(Consumer<Integer> con)
	{
		return i -> 
		{
			try {
				con.accept(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
}
