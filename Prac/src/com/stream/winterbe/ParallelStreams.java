package com.stream.winterbe;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ParallelStreams {

	public static void main(String[] args) {
		
//		IntStream range = IntStream.range(2, 5);
		IntStream rangeClosed = IntStream.rangeClosed(2, 5);
		rangeClosed.forEach(System.out::println);
//		range.forEach(System.out::println);
		
		   Random random = new Random();
		   DoubleStream doubles = random.doubles().limit(2);
		   doubles.forEach(System.out::println);
//		   System.out.println(doubles);
		
		
		/*ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println(commonPool);*/
	}
}
