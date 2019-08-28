package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArbitaryObjectReference {

	public static void main(String[] args)
	{
		
		List<Employees> asList = Arrays.asList(new Employees("Ahmed"),new Employees("Malik"));
		
		Consumer<Employees> printName = Employees::printName;
		
		asList.forEach(printName);
		
		Check<Employees,String,String> check =  Employees::getName;
		  String disp = check.disp(new Employees("AHmed"), "Malik");
		  System.out.println(disp);
		/*
		Check<String,String> check = Employees::getName;
		String disp = check.disp("hi");
		System.out.println(disp);
		*/
		
		
		/*
		Check<String,String> check = Employees::getName;
		String disp = check.disp("Hi");
		System.out.println(disp);
		*/
	}
}
interface Cousumer<T>{
 void accept(T t);
}

interface Check<T,U,R>{
	
	public R disp(T t, U u);
}


class Employees 
{
	private String name;
	
	public Employees(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public  String getName(String city) {
		System.out.println("wwww");
		return city;
	}
	
}

class Admin 
{
	private String name;
	
	public Admin(String name) {
		this.name = name;
	}
	
	public void printName(String name) {
		System.out.println(name);
	}
}


