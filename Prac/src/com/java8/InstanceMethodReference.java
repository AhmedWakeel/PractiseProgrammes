package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class InstanceMethodReference {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(10, "C"));
		employee.add(new Employee(30, "B"));
		employee.add(new Employee(20, "A"));
         employee.forEach(x -> System.out.println(x.getName()));
         
         System.out.println("-------------------");
		List<String> names = InstanceMethodReference.getNames(employee, Employee::getName);
		Collections.sort(names,(x1 , x2) -> x1.compareTo(x2));
		names.forEach(System.out::println);
	}

	public static List<String> getNames(List<Employee> employee, Function<Employee, String> f) {

		List<String> names = new ArrayList<>();

		employee.forEach(x -> names.add(f.apply(x)));

		return names;

	}
}
