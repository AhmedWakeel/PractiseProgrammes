package com.exception;

public class EmailTesy {

	public static void main(String[] args) {
		
		String s = "wakeel@pragiti.com";
		
		           int indexOf = s.indexOf("@");
		           
		String ste = s.substring(0, s.indexOf("@"));
//		String substring = s.substring(s.lastI);
//		System.out.println(substring);
		
		String s1 = s.substring(0, 6);
		System.out.println(s1);
	}
}
