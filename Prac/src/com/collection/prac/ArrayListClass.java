package com.collection.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ArrayListClass {

	public static void main(String[] args)
	{
//		test();
		
//		list();
		
		/*List<String> list = new LinkedList<>();
		list.add("a");
		list.add("b");*/
		
//		hashset();
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		/*priorityQueue.add("b");
		priorityQueue.offer("a");*/
		
		priorityQueue.forEach(System.out::println);
		
		/*String element = priorityQueue.element();
		System.out.println(element);*/
		
		String peek = priorityQueue.peek();
		System.out.println(peek);
		
		/*String poll = priorityQueue.poll();
		System.out.println(poll);*/
		
		/*String remove = priorityQueue.remove();
		System.out.println(remove);*/
		   
		priorityQueue.forEach(System.out::println);
	

	}

	private static void hashset() {
		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  
		  
		  System.out.println(al.first());
	}

	private static void list() {
		List<String> asList = new ArrayList<>();
		List<String> asList1 = new ArrayList<>();
		
		
		asList.add("a"); asList.add("b"); asList.add("c");
		boolean contains = asList.contains("b");
		System.out.println(contains);
		/*for(String str : asList)
			System.out.println(str);*/
		
	/*	asList.add(2, "w");
		for(String str : asList)
			System.out.println(str);*/
		
		asList1.add("d"); asList1.add("x"); asList1.add("l");
		
		asList.addAll(1,asList1);
		for(String str : asList)
			System.out.println(str);
//		asList.removeAll(asList1);
//		asList.retainAll(asList1);
		
	/*	for(String str : asList)
			System.out.println(str);
		*/
		
		  /* List<String> asList2 = Arrays.asList("a","b","c");
		   List<String> asList3 = Arrays.asList("d","e","f");
		   
		   asList2.addAll(asList3);
		   
		   asList2.forEach(System.out::println);
		   */
		  /* for(String str : asList2)
			   System.out.println(asList2);*/
	}

	private static void test() {
		List<String> asList = Arrays.asList("a","b","d");
		asList.forEach(System.out::println);
		for(String Str : asList)
		{
			System.out.println(Str);
		}
		
		System.out.println("----------------");
		
		asList.add(0, "C");
		for(String Str : asList)
		{
			System.out.println(Str);
		}
	}
}
