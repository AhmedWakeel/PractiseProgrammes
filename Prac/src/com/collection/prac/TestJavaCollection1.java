package com.collection.prac;

import java.util.*;

abstract class TestJavaCollection1 {
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
	
            
		/*for(String str : list )
		{
			System.out.println(str);
		}*/
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	protected static void mk()
	{
		
	}
	protected  abstract void ab();
	
	protected static void  ss() {
		
	}
}