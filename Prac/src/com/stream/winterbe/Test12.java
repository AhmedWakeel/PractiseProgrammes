package com.stream.winterbe;

public class Test12 {

	public static void main(String[] args) {
		
		/*StringBuffer buffer = new StringBuffer("ab");
		StringBuffer buffer2 = new StringBuffer("ab");
		
		
		System.out.println(buffer.equals(buffer2));
        System.out.println(buffer.hashCode());	
        System.out.println(buffer2.hashCode());*/
        
        String string  = new String("ab");
        String string2 = new String("ab");
        
        System.out.println(string.equals(string2));
        System.out.println(string.hashCode());
        System.out.println(string2.hashCode());
	}
}
