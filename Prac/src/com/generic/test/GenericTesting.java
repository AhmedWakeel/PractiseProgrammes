package com.generic.test;

import java.util.ArrayList;
import java.util.List;

public class GenericTesting<T> {

	public <L extends T> GenericTesting(L t) {
		System.out.println(t.getClass().getName());
	}
	
	public GenericTesting() {
	}
}

class Gen
{
	public static void main(String[] args)
	{
		System.out.println(10%10);
		
		List<Integer> integers = new ArrayList<>(1000);
		integers.add(2);
		System.out.println(integers.size());
		Integer[] is= new Integer[3];
		System.out.println(is.getClass().getSuperclass().getName());
//        is = (Integer[])new Object[3]; 
		
		
		
		/*GenericTesting<Object> genericTesting = new GenericTesting<Object>("Hi");
		GenericTesting genericTesting1 = new GenericTesting();*/
	}
}
