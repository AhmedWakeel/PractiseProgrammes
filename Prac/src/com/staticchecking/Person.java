package com.staticchecking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Person {

	int age;
	String name;
	String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", city=" + city + "]";
	}	
}

class MainInstanceMethodRefernce
{
	public static void main(String[] args)
	{
		List<Person> asList = Arrays.asList(new Person(20, "malik","mumbai"),new Person(30, "khan","pune"));
	    List<Employee> asList2 = Arrays.asList(new Employee(20, "malik"),new Employee(30, "khan"));
		
	/*	List<String> call = MainInstanceMethodRefernce.call(asList,Person::getCity);
			call.forEach(System.out::println);	*/
	    
	                List<String> call = MainInstanceMethodRefernce.call(asList,Person::getName);
	                call.forEach(System.out::println);
	}

	private static List<String> call(List<Person> asList, Function<Person,String> f) {
		
		List<String> list = new ArrayList<>();
		asList.forEach(x -> list.add(f.apply(x)));
		return list;
		
	}
}


class Employee 
{
	 int id ;
	 String name;
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
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	 
	 
	
}





