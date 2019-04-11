package com.mj.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakTest {

	public static void main(String[] args) {

		
		Boolean boolean1 = get();
		System.out.println(boolean1);
		
		/*Boolean b  = true;
		Boolean b1 = new Boolean(true);

		System.out.println(b1== null);*/
//		test();
//		System.out.println("www");

	}

	public static Boolean get() {
		return null;
	}
	
	private static void test() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string =  iterator.next();
			System.out.println(string);
			if("a".equals(string))
			{
				iterator.remove();
			}
		}
		System.out.println("---------");
		for(String st : list)
			System.out.println(st);
		
		
		/*for (String str : list) {
	
			if (str.equals("a")) {
//				return;
//				continue;
//				System.out.println(str + "- in break");
//				break;
			} else {
				System.out.println(str);
			}
		}
		*/
	}
}
