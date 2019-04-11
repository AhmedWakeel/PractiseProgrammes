package com.aggregation.check;

public class Employee {

	private String emp_name;
	private int   age;
	
	private Address address;

	public Employee(String emp_name, int age, Address address) {
		super();
		this.emp_name = emp_name;
		this.age = age;
		this.address = address;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", age=" + age + ", address=" + address + "]";
	}
}

class ClientClass
{
	public static void main(String[] args) {
		
		Address address = new Address();
		address.setCity("mumbai");  address.setState("maharashtra"); address.setCountry("india");
		
		Employee employee = new Employee("malik", 20, address);
//		System.out.println(employee);
		employee = null;
		System.out.println(employee);
		System.out.println(address);
	}
}


