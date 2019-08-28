package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class InstanceMethodReference {

	public static void main(String[] args) {

		List<Employees> employee = new ArrayList<>();
		employee.add(new Employees(10, "C"));
		employee.add(new Employees(30, "B"));
		employee.add(new Employees(20, "A"));
         employee.forEach(x -> System.out.println(x.getName()));
         
         System.out.println("-------------------");
		List<String> names = InstanceMethodReference.getNames(employee, Employees::getName);
		Collections.sort(names,(x1 , x2) -> x1.compareTo(x2));
		names.forEach(System.out::println);
	}

	public static List<String> getNames(List<Employees> employee, Function<Employees, String> f) {

		List<String> names = new ArrayList<>();

		employee.forEach(x -> names.add(f.apply(x)));

		return names;

	}
}
