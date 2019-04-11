package com.stream.stackify;

import java.util.Arrays;
import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreations {
    static  int i = 0;
	 static int k1 = 30;
	public static void main(String[] args) {
		

		Stream.generate((Employee::getId)).limit(5).forEach(System.out::println);
		
		
/*		Employee employee1 = new Employee(2, "mk");
		Employee employee2= new Employee(2, "sk");
		Employee employee3= new Employee(5, "gk");
		List<Employee> asList = Arrays.asList(employee1,employee2,employee3);
		  List<Integer> asList2 = Arrays.asList(1,2,3,4,5);
		   
		   Map<Boolean, List<Integer>> collect = asList.stream().map(Employee::getId).collect(Collectors.partitioningBy(x -> x%2 == 0	));
*/		   
		  
		
//		     DoubleSummaryStatistics summaryStatistics = asList.stream().mapToDouble(Employee::getId).summaryStatistics();
//		     System.out.println(summaryStatistics.);
		
		   /*IntSummaryStatistics collect = asList.stream().collect(Collectors.summarizingInt(Employee::getId));
		   System.out.println(collect.getAverage());*/
		
		
//		 Vector<String> collect = asList.stream().map(Employee::getName).collect(Collectors.toCollection(Vector::new));
		
		/*Set<String> collect = asList.stream().map(Employee::getName).collect(Collectors.toSet());
		System.out.println(collect);*/
		/*String string = asList.stream().map(Employee::getName).collect(Collectors.joining(",", "c", "d")).toString();
		System.out.println(string);*/
		
		/*Integer reduce = asList.stream().map(Employee::getId).reduce(1, Integer::sum);
		System.out.println(reduce);*/
		
		
		
//		OptionalDouble average = Arrays.asList(employee1,employee2).stream().mapToInt(Employee::getId).average();
		
/*		 Integer[] integers = {1,2,3};
		 IntStream mapToInt = Arrays.asList(integers).stream().mapToInt(x -> x+3);
*///		 System.out.printldn(mapToInt);
//		 Arrays.asList(integers).stream().max(Comparator.comparing(Employee::getId));
		 
		
		
		
		
		/*Employee x1 =new Employee(2, "sk");
		Employee x2 =new Employee(1, "gk");
		Employee x =new Employee(3, "mk");
		
		
          Optional<Employee> findFirst = Arrays.asList(x,x1,x2).stream().sorted((e1,e2) -> 
          {
        	  count();
         return e1.getId()-e2.getId();
          }
        		  ).findFirst();		
          Employee employee = findFirst.get();
          System.out.println(employee);
		   System.out.println(i);
*///          test4();		
	}
	public static void count() {
		++i;
	}

	private static void test4() {
		/*  Stream<Integer> iterate = Stream.iterate(2, x -> x*2);		
		            List<Integer> collect = iterate.limit(5).skip(2).collect(Collectors.toList());
		            collect.forEach(System.out::println);*/
				
				/*Integer[] integers = {1,2,3,4};
		            Optional<Integer> findFirst = Stream.of(integers).
		            		                                  map(StreamCreations::mm).
		            		                                  filter(x -> x !=null).filter(x -> x>0).
		            		                                  findFirst();*/
				
		test3();
		
		//		 Arrays.asList(1,2).stream().forEach(e -> System.out.println(e));
		//		 Builder<Object> builder = Stream.builder();
		//		builder.andThen(after)
				
		/*		Optional<Integer> findFirst = Arrays.asList(1,2).stream().filter(x -> x>0).map(x -> x).findFirst();
				Integer integer = findFirst.get();
		*/
	}
	
	   public static int mm(int i) {
		   return i;
		
	}
	
	private static void test3() {
		//		  Map<Integer,Employee> mp = new HashMap<>();
				Employee employee1 = new Employee(1, "mk");
				Employee employee2= new Employee(2, "sk");
				List<Integer> asList = Arrays.asList(1,2);
				
				Stream<Map<Integer, Employee>> map = asList.stream().map(x -> Employee.getMp(x));
				List<Map<Integer, Employee>> collect = map.collect(Collectors.toList());
				collect.forEach(x -> System.out.println(x));
				
				List<List<String>> namesNested = Arrays.asList( 
					      Arrays.asList("Jeff", "Bezos"), 
					      Arrays.asList("Bill", "Gates"), 
					      Arrays.asList("Mark", "Zuckerberg"));
		
					    List<String> namesFlatStream = namesNested.stream()
					      .flatMap(Collection::stream)
					      .collect(Collectors.toList());
	}
}

class Employee
{
	static int  id ;
	String name;
	static Map<Integer,Employee> mp = new HashMap<>();
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		mp.put(this.getId(), this);
		this.id = id;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public static Map<Integer, Employee> getMp(int id) {
		return (Map<Integer, Employee>) mp.get(id);
	}
}
