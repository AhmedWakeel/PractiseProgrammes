package com.utf;

import java.io.UnsupportedEncodingException;

public class StringConversion {

	public static void main(String[] args) throws UnsupportedEncodingException
	{
// â		
		/*String str ="“";
		System.out.println(str);
		char ch = '“'; */
//		â â â â
		String s = "â";
		String s1 = "â";
		String s2 = "â";
		System.out.println(s1.equals(s));
		
//		"
/*		byte b = '"';
		System.out.println(b);
		char c = ';';
		System.out.println((byte)c);

		char b1 = ';';
		System.out.println((byte)b1);
		
       String s = "2â€ x 3â€ x 27.00â€";
       System.out.println(s);
       String replace1 = s.replaceAll("â€", "\"");
       System.out.println(replace1);
       System.out.println(s);
       String replace = s.replace("â€", "\"");
       System.out.println(replace);*/
       /* String s = "Hello \u0056nicode";
        System.out.println(s);
		System.out.println("Hello \u0055nicode".length());*/
		
		
	/*	String input = StringUtils.stripAccents("Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ");
		String input = StringUtils.stripAccents("2â€ x 3â€ x 27.00â€");
		String string = Normalizer.normalize("2â€ x 3â€ x 27.00â€", Normalizer.Form.NFD);
//		string = string.replaceAll("[^\\p{ASCII}]", "");
		string = string.replaceAll("\\p{M}", "");
	    System.out.println(string);*/
		
		
/*//		String s = "2” x 3” x 27.00”";
		String s = "â";
		System.out.println(s);
		char b = 'â';
		char c = '"';
		
		System.out.println((int)c);
		
		byte ptext[] = s.getBytes("ISO-8859-1"); 
		String value = new String(ptext, "UTF-8"); 
		System.out.println(value);*/
	}
}
