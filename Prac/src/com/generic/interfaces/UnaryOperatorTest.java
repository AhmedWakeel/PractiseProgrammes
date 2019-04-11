package com.generic.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("2","4");
		UnaryOperator<String> operator = x -> ""+x+x;
		call(asList,operator).forEach(System.out::println);
	}

	private static  ArrayList<String> call(List<String> asList, UnaryOperator<String> operator) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		asList.forEach(x -> arrayList.add(operator.apply(x)));
		return arrayList;
		
	}
}
