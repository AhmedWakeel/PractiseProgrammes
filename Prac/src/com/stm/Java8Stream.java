package com.stm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.generic.interfaces.Employee;

public class Java8Stream {

	public static void main(String[] args) {

		
		long count = Stream.of(2,4,2,5,66).mapToInt(x -> x).count();
		
		
		List<Employee> empList = new ArrayList<>(); 
		
		empList.add(new Employee(3, "malik")); empList.add(new Employee(31, "malik1"));
		
		Stream<Integer> map = empList.stream().map(Employee::getId);
		
//		 List<List<List<String>>> namesNested = 
		 
	/*List<List<List<String>>> asList = Arrays.asList(Arrays.asList( 
			      Arrays.asList("Jeff", "Bezos"), 
			      Arrays.asList("Bill", "Gates"), 
			      Arrays.asList("Mark", "Zuckerberg")),
			
			Arrays.asList( 
				      Arrays.asList("Jeff", "Bezos"), 
				      Arrays.asList("Bill", "Gates"), 
				      Arrays.asList("Mark", "Zuckerberg")
			));*/
				
		
		

//		List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		 
//       namesFlatStream.forEach(System.out::println);
		
		/*
		 * List<Employee> empList = new ArrayList<>(); empList.add(new
		 * Employee(3, "malik")); empList.add(new Employee(31, "malik1"));
		 * Employee[] employees = empList.stream().toArray(Employee[]::new);
		 * 
		 * System.out.println("yes "+employees.getClass().getName());
		 */

		/*
		 * Integer[] empIds = { 1, 2, 3, 4 };
		 * 
		 * 
		 * Optional<Integer> max = Stream.of(empIds).map(x -> x).distinct()
		 * .max(Comparator.comparing(x -> x>2));
		 * 
		 * Integer integer = max.get(); System.out.println(integer);
		 */

	}
}
