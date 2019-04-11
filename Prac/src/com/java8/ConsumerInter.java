package com.java8;

import java.util.ArrayList;
import java.util.Collections;

public class ConsumerInter {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("zi");
		arrayList.add("yes");
		System.out.println(arrayList);
//		Collections.sort(arrayList, (O1, O2) -> O1.compareTo(O2));
		Collections.sort(arrayList, new ComparatorImp());
		System.out.println(arrayList);

		/*
		 * arrayList.forEach(System.out::println); arrayList.forEach(x ->
		 * System.out.println());
		 */
		// arrayList.forEach(ConsumerInter::mk);
	}

	public static void mk(String s) {
		System.out.println(s);
	}

}
