package com.straam.creation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreations {

	public static void main(String[] args) {
		
		IntStream chars = "abc".chars();
		/*boolean allMatch = Arrays.asList(1,2).stream().filter(x -> x>0).map(x -> x+10).allMatch(x -> x>=1);
		System.out.println(allMatch);*/
		
		/* Long collect = Arrays.asList(1,2).stream().filter(x -> x>0).map(x -> x+10).collect(Collectors.counting());
		 System.out.println(collect);*/
		
		   /*Double collect = Arrays.asList(1,2).stream().filter(x -> test(x)).map(x -> x).collect(Collectors.averagingDouble(x -> x));
		  System.out.println(collect);*/
		
           Stream<Integer> filter = Arrays.asList(1,2).stream().filter(x -> test(x));
//           filter.
             
//            map.allMatch( x -> tt(x -> x>10,x));
            
            
            
            
            Predicate<Integer> predicate = new Predicate<Integer>() {
				
				@Override
				public boolean test(Integer t) {
					return  t>1;

				}
			};
			
			boolean tt = tt(predicate,10);
			}
	public static boolean tt(Predicate<Integer> predicate, int i)  {
		
		return predicate.test(i);
		
	}
	
	
	
	public static boolean test(int i) {
		
		return i>1;
		
	}
}
