package com.stream.winterbe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCheck {

	public static void main(String[] args) {
		
		System.out.println(691/10);
		List<Integer> ls = Arrays.asList(7,3,6,8);
		System.out.println(ls);
		
		Collections.sort(ls,(o1,o2) -> 
		{
		  boolean b =o1 > o2;
			System.out.println(o1+"=o1 & o2="+o2+" ## "+o1+">"+o2+"=" +( b ? 1 : -1));
			return o1 > o2 ? 1 : -1; 
		});
       
		System.out.println(ls);
	}
}
