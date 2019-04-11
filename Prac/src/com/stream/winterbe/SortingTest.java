package com.stream.winterbe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(303,690,187,982,294);
		System.out.println(ls);
		
		Collections.sort(ls,(o1,o2) -> o1%10 >o2%10 ? 1: -1);
		System.out.println(ls);
		
	}
}
