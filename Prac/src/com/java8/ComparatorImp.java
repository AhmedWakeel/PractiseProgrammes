package com.java8;

import java.util.Comparator;
import java.util.List;

public class ComparatorImp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

	



}
