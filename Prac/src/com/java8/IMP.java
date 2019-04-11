package com.java8;


   class Imp
 {
	 public static void main(String[] args) {
		
	  FuncationalInterf fun  =  (n , p) -> p>n ; 
	  boolean mk = fun.mk(30, 40);
	  System.out.println(mk);
	}
 }