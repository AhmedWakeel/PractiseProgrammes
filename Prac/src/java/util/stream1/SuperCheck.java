package java.util.stream1;

import java.util.stream.IntStream;

public class SuperCheck {

	public static void main(String[] args) {
		
		IntStream range = IntStream.range(2, 5);
		range.forEach(System.out::println);
	}
	
}

