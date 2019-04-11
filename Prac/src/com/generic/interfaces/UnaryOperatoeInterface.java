package com.generic.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class UnaryOperatoeInterface {

	public static void main(String[] args) {
		
		Map<String ,String> map = new HashMap<>();
		map.put("ab2", "dd3");
		map.put("abr", "dd2");
		map.put("abe", "dd2");
		
		BinaryOperator<String> binaryOperator = (x,y) -> x+y;
		List<String> call = call(map,binaryOperator);
		call.forEach(System.out::println);
		
	}

	private static List<String> call(Map<String, String> map, BinaryOperator<String> binaryOperator) {
		List<String> ls = new ArrayList<>();
		
		map.forEach((s,k) -> ls.add(binaryOperator.apply(s, k)));
		return ls;
	}
}
