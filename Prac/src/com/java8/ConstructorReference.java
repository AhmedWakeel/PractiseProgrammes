package com.java8;

import java.util.Locale;
import java.util.function.BiFunction;

public class ConstructorReference {

	
	public static void main(String[]args)
	{
		
		
		Locale locale =  new Locale("hindi", "india");
		System.out.println(locale.getCountry());
		
		
		BiFunction<String, String, Locale> biFunction = (x,y) -> new Locale(x,y);
		System.out.println(biFunction.apply("Hindi", "India").getCountry());
//		System.out.println(apply.getCountry());
		
		
		BiFunction<String, String, Locale> biFunction2 = Locale::new;
		Locale apply = biFunction2.apply("English", "US");
		
	}
}



