package com.generic.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenCollect // <T extends B>
{

	public <T> void mk(T i) {

		T t = i;
		System.out.println(t);

	}

	public static void sk(List ls) {

		ls.add("hi");
		System.out.println(ls);

	}

	public static void m1(ArrayList<String> ls) {

	}

	public static void m1(List<Integer> ls) {

	}

}

class B {
	private void gg() {

	}

	public static void main(String[] args) {

		/*
		 * GenCollect collect = new GenCollect(); collect.mk(39);
		 */

		List<Integer> integers = new ArrayList<>();
		integers.add(12);
		System.out.println(integers);
		GenCollect.sk(integers);
		System.out.println(integers);

	}
}

class A extends B {

	public void hi() {

	}
}