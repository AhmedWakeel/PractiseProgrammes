package com.inherit;

import java.util.ArrayDeque;
import java.util.Deque;

public class C {
	
	public  void m1()
	{
		System.out.println("in the C class");
	}
	public static void main(String[] args)
	{
		Deque<String> deque = new ArrayDeque<>();
		System.out.println("hi");
		deque.add(null);
		System.out.println(deque);
	}
}
