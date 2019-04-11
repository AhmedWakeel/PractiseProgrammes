package com.stream.creation;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import java.util.Arrays;
import java.util.List;

class Employee
{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}

public class StreamCreation {

	

	public static void main(String[] args) {

		  Employee[] employees ={new Employee(1, "Jeff Bezos", 100000.0),new Employee(2, "Bill Gates", 200000.0)};	
          List<Employee> asList = Arrays.asList(employees);		  
           List<Integer> collect = asList.stream().map(Employee::getId).collect(Collectors.toList());
		  
//		  test1();
//		  test(employees);
	}

	private static void test1() {
		Builder<Object> builder = Stream.builder();
//		  System.out.println(builder.getClass().getName());
		  Builder<Object> builderobj = builder.add(20);
		  builder.accept(44);
		  Stream<Object> build2 = builderobj.build();
		  Stream<Object> build = builder.build();
		  build.forEach(System.out::println);
//		  Stream<Object> build = builder.build();
	}

	private static void test(Employee[] employees) {
		List<Employee> asList = Arrays.asList(employees);
		asList.stream().forEach(System.out::println);
//		  System.out.println(asList.getClass().getName());
		  Stream<Employee> stream2 = asList.stream();
		Stream<Employee> stream = Arrays.stream(employees);
		Stream<Employee> of = Stream.of(employees);
		Stream<Object> empty = Stream.empty();
		Stream<Integer> iterate = Stream.iterate(20, x -> x+30);
		Stream<Integer> of2 = Stream.of(new Integer(2),new Integer(2));
	}
	
}
