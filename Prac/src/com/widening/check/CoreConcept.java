package com.widening.check;

public class CoreConcept {

	public static void main(String[] args) {
		
		Integer integer = new Integer(29);
		Float   float1  = new Float(29.00);
		
//		System.out.println(integer == float1);
		System.out.println(integer.hashCode());
		System.out.println(float1.hashCode());
		System.out.println(integer.equals(float1));
	}
	
}
