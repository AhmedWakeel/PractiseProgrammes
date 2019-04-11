package com.straam.creation;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamCreation {

	public static void main(String[] args) {
		
//		Stream<String> build = Stream.<String>builder().add("a").add("b").add("c").build();
//		Stream.generate(() -> "element");
//		Stream<Integer> limit = Stream.iterate(40, n -> n + 2).limit(20);
		IntStream range = IntStream.range(3, 3);
		
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(3);
	}
}
