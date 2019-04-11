package com.stream.revision;

import java.util.HashSet;

import com.sun.org.apache.regexp.internal.recompile;

public class TestHashCode {

	public static void main(String[] args) {
     
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		employee1.setId(10);
		employee2.setId(10);
		
//		System.out.println(employee1.equals(employee2));
		 HashSet<Employee> hashSet = new HashSet<>();
		 hashSet.add(employee1);
		 hashSet.add(employee2);
		System.out.println(hashSet);
		
	}
}

class Employee
{
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	@Override
	public int hashCode()
	{
		final int PRIME = 31;
		int result = 1;
		return PRIME*result +getId();
		
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj== null)
		{
			return false;
		}
		if(obj==this)
		{
			return true;
		}
		if(obj.getClass() != this.getClass())
		{
			return false;
		}
		Employee e = (Employee)obj;
		System.out.println("inside the employee");
		return this.id==e.id;
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
