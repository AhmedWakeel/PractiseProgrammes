package com.association;

public class Person {

	private String name;
	private int age;
	
	private Address address;

	public Person() {
		address = new Address();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
class ClientClass
{
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setAge(20); person.setName("malik");
		System.out.println(person);
		person.getAddress().setCity("mumbai"); person.getAddress().setCountry("india");
		System.out.println(person);
		person = null;
		System.out.println(person);
	}
}




