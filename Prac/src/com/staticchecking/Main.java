package com.staticchecking;

public class Main {

	

	public static void main(String[] args) {
		
	/*	MyInterf interf = (x,y) -> System.out.println(x+y);
		interf.mk(4, 5);*/
	
		MyInterf interf	 = St::sttttt;
		
		
	}
	
	public void skkkk() {
		
		MyInterf interf = Main::st;
	}
	
	
	private static void st(int i , int k) {
		System.out.println(i+k+" inside static reference");
	}
	
	public  void  sss(int i , int p) {
		
		System.out.println(i);
	}
}

