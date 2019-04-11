package com.generic.interfaces;

import java.util.function.Function;

public class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void call(Function<Employee, String> f)
	{
		String apply = f.apply(this);
		System.out.println(apply);
		/*	return apply;*/
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void thisPrint()
	{
		System.out.println(this.getId());
	}

	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}*/
	
}
