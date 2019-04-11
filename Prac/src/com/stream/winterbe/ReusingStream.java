package com.stream.winterbe;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReusingStream {
	
	
	
	public static void main(String[] args) {
		
		
		final String currentDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println(" current date "+currentDate);
		
		List<Person> persons =
			    Arrays.asList(
			        new Person("Max", 18,"mum"),
			        new Person("Peter", 23,"pune"),
			        new Person("Pamela", 23,"manglore"),
			        new Person("David", 12,"pun"));
		
		      
//		         persons.stream().reduce((p1,p2) -> p1.age>p2.age ? p1 :p2).ifPresent(System.out::println);
		       /*  Person reduce = persons.stream().reduce(new Person("",	0, "mumbai"),(p1,p2) -> 
		         {
		        	 p1.age +=p2.age;
		        	 p1.name += p2.name;
		        	 return p1;
		         });
		System.out.println(reduce);*/
		
//		        String collect = persons.stream().filter(p -> p.age>15).map(p -> p.city).collect(Collectors.joining());
//		        String collect = persons.stream().filter(p -> p.age>15).map(p -> p.city).collect(Collectors.joining(" , "));
		  /*    String collect = persons.stream().filter(p -> p.age>15).map(p -> p.city).collect(Collectors.joining(" and ", "in world ", " are legal "));
		        System.out.println(collect);*/
		
		
/*		            IntSummaryStatistics collect = persons.stream().collect(Collectors.summarizingInt(p -> p.age));
		            System.out.println(collect);*/
		
       /*  DoubleSummaryStatistics collect = persons.stream().collect(Collectors.summarizingDouble(p -> p.age));
         System.out.println(collect);*/
		
		
/*		     Double collect = persons.stream().collect(Collectors.averagingDouble(p -> p.age));
		     System.out.println(collect);
*/		
		
		  /*   Map<Integer, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(p -> p.age));
		     collect.forEach((age, p) -> System.out.println(age+" "+p));*/
		
//		List<Person> collect = persons.stream().filter(p -> p.name.contains("a")).collect(Collectors.toList());
//		List<String> collect = persons.stream().filter(p -> p.name.contains("a")).map(p -> p.name).collect(Collectors.toList());
		
		/*Supplier<Stream<String>> sup = () -> Stream.of("1","2","3").filter(s -> s.contains("1"));
		
		 sup.get().anyMatch(x -> x.contains("33"));
		 sup.get().anyMatch(x -> x.contains("43"));*/

		
//		new ReusingStream().re1();	
	}

	private void re1() {
		Stream<String> of = Stream.of("hi","hi1","hi3");
		Stream<String> filter = of.filter(x -> x.contains("1"));
		
		filter.anyMatch(x -> x.contains("3"));
		filter.noneMatch(x -> x.contains("3"));
		
	}

}
class Person {
    String name;
    int age;
    String city;

    Person(String name, int age,String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

	@Override
	public String toString() {
		return " [name=" + name + ", city=" + city + "]";
	}

}
