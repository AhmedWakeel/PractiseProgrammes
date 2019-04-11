package com.stream.winterbe;

public class TestError {

	public static void main(String[] args) {
		System.out.println("in main");
		try {
			mk("Hi");
		} catch (Exception e) {
			System.out.println("in the main catch block");
			e.printStackTrace();
		}
		
	}

	private static void mk(String string) throws RuntimeException{
           System.out.println("in mk");
           
     	  sk(string);
		 /* try {
			  sk(string);
		} catch (Exception e) {
			System.out.println("in the mk catch block");
			e.printStackTrace();
		}*/
	}

	private static void sk(String string) {
       System.out.println("in sk");	
       int k = 10/0;
		if(string.contains("H"))
		{
//			throw new RuntimeException();
		}
		System.out.println(string);
		
	}
}
