package com.stream.revision;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
 
	public static void main(String[] args) {
		
		Stream<Integer> of = Stream.of(20);
		Stream<Integer> of2 = Stream.of(20,45);
		
		IntStream.range(2, 4).forEach(System.out::println);
	}
}
