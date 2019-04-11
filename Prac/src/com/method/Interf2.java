package com.method;

public interface Interf2 {

	public default void mk(String name) {
		
		System.out.println("inside of Interf2");
	}

	public   default void mk1(String name) {
		
		System.out.println("inside of Interf2");
	}
}