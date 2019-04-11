package com.stream.baeldung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamCreation  extends A{

	  public static Stream<String> mk(List<String> ls ) {
		  
		  return ls == null || ls.isEmpty() ? Stream.empty() : ls.stream();
		
	}
	  public static <T> P<T> ss(P<T> p) {
		return  p;
	}
	
	public static void main(String[] args) {
		     
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		streamIterated.forEach(System.out::println);
		
		     /*    Stream<String> streamGenerated =
				  Stream.generate(() -> "element").limit(10);*/
		
		
		P<String> p = new P<>();
		 P<String> ss = StreamCreation.ss(p);
		  System.out.println(ss.getClass().getName());
		
//		test();
//		arrayCreation();
	}
	private static void test() {
		Stream<String> streamBuilder =
	    Stream.<String>builder().add("a").add("b").add("c").build();
		 Builder<String> builder = Stream.<String>builder();
		 System.out.println(builder.getClass().getTypeName());
		
		
		     /* String[] var0 = {"a","b","c"};
		       Stream<String> of = Stream.of("a","b","c");*/
//		       Stream<String> of = Stream.of(var0);
//		    Stream<String> stream = Arrays.stream({"a","b","c"});
//		      Stream<String> stream = Arrays.stream(var0);
	}

	private static void arrayCreation() {
		A a = new StreamCreation();
		System.out.println(a.getClass().getClassLoader().getClass().getModifiers());
		List<String> list = new ArrayList<>();
		Stream<String> mk = mk(list);
		System.out.println(mk.getClass().getTypeName());
		Stream<String> empty = Stream.empty();
	}
}

interface X<T>
{
}
class P<T>  implements X<T>
{
}

class A
{
	
}
