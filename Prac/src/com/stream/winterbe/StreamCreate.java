package com.stream.winterbe;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {

	public static void main(String[] args) {
		
		
		Stream.of("d2", "a2", "a1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		
		/*Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })/
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));*/
		
		
//		stream3();
//      stream2();
//		stream1();
	}

	private static void stream3() {
		boolean anyMatch = Stream.of("a1","a2","a3").map(x ->
		{
			System.out.println("R "+x);
	return	x.substring(1);
		}
				).anyMatch(
				x -> 
				{
					System.out.println("t "+x);
					return x.contains("2");
				});
		
		
		/* Stream.of(1,2,3).filter( x ->
		 {
			 System.out.println("hi "+x);
			 return true;
		 }).forEach(x -> System.out.println(x));*/
		 
		/* Stream.of(1,2,3).filter( x ->
				 {
					 System.out.println("hi "+x);
					 return true;
				 });*/
	}

	private static void stream2() {
		//		Stream<Integer> mapToObj = IntStream.range(1, 3).mapToObj(x -> x+2);
				Stream<String> mapToObj = IntStream.range(1, 4)
			    .mapToObj(i -> "a" + i);
				
		             /*IntStream range = IntStream.range(1, 3);		
		             range.forEach(System.out::println);*/
		  		
		//		OptionalDouble average = Arrays.asList(new Integer[]{1,2,3}).stream().mapToInt(Integer::intValue).average();		
				/*double asDouble = average.getAsDouble();
				System.out.println(asDouble);*/
				
				
				/*IntStream.range(2, 4)
			    .forEach(System.out::println);*/
				
				
				Stream<Integer> of = Stream.of(1,2,3);
		//		of.findAny().ifPresent(System.out::println);
	}

	private static void stream1() {
		Stream<String> stream = Arrays.stream(new String[]{});
		Stream<String> map = stream.map(String::toUpperCase);
		Stream<String> sorted = map.sorted();
		Optional<String> findFirst = sorted.findFirst();
		findFirst.ifPresent(System.out::println);
//		String orElse = findFirst.orElse("");
//		System.out.println(orElse);
//		System.out.println(findFirst);
//		sorted.forEach(System.out::println);
	}
}
;