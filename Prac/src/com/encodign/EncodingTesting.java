package com.encodign;

import java.io.UnsupportedEncodingException;

public class EncodingTesting {
	
	String s ;
	String[] ss = new String[1];
	
	public void m1(String str)
	{
		s = str;
		ss[0] = str;

		try
		{
			System.out.println(ss[1]);			
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
		{
			System.out.println("handling the exception");
		}
		System.out.println(s);
	}
	

	public static void main(String[] args) throws UnsupportedEncodingException
	{
		new EncodingTesting().m1(null);
		
		String utf = "1” x 4” @ 12’\r\n" + 
				"2” x 4 ¾” @ 12’\r\n" + 
				"1” x 2 ¼” @ 12’\r\n" + 
				"¾” x 1 7/8” @ 12’\r\n" + 
				"1” x 2 ½” @ 12’\r\n" + 
				"¾” 2 ½” @ 12’ \r\n" + 
				"1” x 3” @ 12’ \r\n" + 
				"1” x 3 ½” @ 12'";
		byte[] data = utf.getBytes("ASCII");
		String ascii = new String(data);
		System.out.println(ascii);
		
		/*String str = new String("½".getBytes("US-ASCII"));
		System.out.println(str);*/
		
		
//		char ss = 'â';
//		System.out.println((byte)ss);
		
		/*String str = "1” x 4” @ 12’\r\n" + 
				"2” x 4 ¾” @ 12’\r\n" + 
				"1” x 2 ¼” @ 12’\r\n" + 
				"¾” x 1 7/8” @ 12’\r\n" + 
				"1” x 2 ½” @ 12’\r\n" + 
				"¾” 2 ½” @ 12’ \r\n" + 
				"1” x 3” @ 12’ \r\n" + 
				"1” x 3 ½” @ 12'";
		        
		
		System.out.println(str);
		System.out.println(")))))))))))))))))");
		       byte[] bytes = str.getBytes(StandardCharsets.UTF_16);
		       String ss = new String(bytes,StandardCharsets.UTF_16);
		       System.out.println(ss);
		
		       byte[] bytearray1 = str.getBytes();
			    String s1 = new String(bytearray1, StandardCharsets.UTF_8);
			    System.out.println(s1);*/
		       
		
		/*byte[] bytearray = "Impresión".getBytes(StandardCharsets.UTF_8);
	    String s = new String(bytearray, StandardCharsets.UTF_8);
	    System.out.println(s);*/
	    
	   /* byte[] bytearray1 = "Impresión".getBytes();
	    String s1 = new String(bytearray1, StandardCharsets.UTF_8);
	    System.out.println(s1);*/
	    
	}
}
