package com.stream.winterbe;

import java.util.Optional;

public class NullChecking {

	public static void main(String[] args) {

//		Optional i = new Optional(new  NullChecking());
		
		
		
		
		/*Outer outer = new Outer();
		 outer.nested =  new Nested();
		  outer.nested.inner = new Inner();
		  outer.nested.inner.name = "malik";*/
		
/*		Optional.of(outer)
		.flatMap(o -> Optional.ofNullable(o.nested))
		.flatMap(n -> Optional.ofNullable(n.inner))
		.flatMap(i -> Optional.ofNullable(i.name))
		.ifPresent(System.out::println);
*/		
//		Outer outer = of.get();
		
		/*Optional.of(new Outer())
	    .flatMap(o -> 
	    {
	    	System.out.println(o.getClass().getName());
	   return Optional.ofNullable(o.nested);
	    });*/
		
/*		Outer outer = new Outer();
		 outer.nested =  new Nested();
		  outer.nested.inner = new Inner();
		  outer.nested.inner.name = "malik";
*///		System.out.println(outer.nested);
//		System.out.println(outer.nested.inner.name);
	}
}

class Outer {
	Nested nested;
}

class Nested {
	Inner inner;
}

class Inner {
	String name;
}