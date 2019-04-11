package com.widening.check;

import java.util.ArrayList;
import java.util.List;

public class Widening {
   
	  int i  = 45;
	  public Widening(int i) {
		  
		  this.i = i;
	}
	
	   
	
	/*  public void mk(Integer i) {
		  System.out.println("1");
	}*/
	/*  public void mk(int i) {
		  System.out.println("2");
	}*/
	/*  public void mk(int... i) {
		  System.out.println("3");
	}*/
	/*  public void mk(Integer...i) {
		  System.out.println("4");
	}*/
	  public void mk(Long i) {
		  System.out.println("5");
	}
	/*  public void mk(Long... i) {
		  System.out.println("6");
	}*/
	  public void mk(long i) {
		  System.out.println("7");
	}
	/*  public void mk(long... i) {
		  System.out.println("8");
	}*/
	  
	  public void sk(Object object) {
		System.out.println(object);
	}
	  
	  
	public static void main(String[] args) {
	
		List<Object> list = new ArrayList<>();
		list.add("ee");
		list.add(10);
		
		
		Widening widening = new Widening(10);
		Widening widening2 = new Widening(10);
		System.out.println(widening);
		System.out.println(widening.hashCode());
		System.out.println(widening2.hashCode());
		System.out.println(widening == widening2);
		System.out.println(widening+"    "+widening2);
		System.out.println(widening.equals(widening2));
		String string = new String("ab");
		String string1 = new String("ab");
		System.out.println(string.hashCode() );
		System.out.println(string.equals(string1));
		
		
			/*long long1 = 30;
		int i =39;
		new Widening().sk(long1);*/
		
	}
}
