package com.generic.collection;

import java.util.ArrayList;
import java.util.List;

public class CompileCheck<T> {

	public static void main(String[] args) {

		/*
		 * Boolean boolean1 =mk(1) ;
		 * 
		 * if((boolean1 != null) && (boolean1 == true)) {
		 * System.out.println(boolean1); }
		 */

		ArrayList<? extends Number > arrayList = new ArrayList<>();
        arrayList.add(new Integer(10), null);
//        arrayList.add(new Float(10));
//		CompileCheck<Man> check = new CompileCheck<>();
		/*
		 * List<Employee> employees = new ArrayList<>(); List<Man> mans = new
		 * ArrayList<>(); check.gk(employees); check.gk(mans);
		 */

	/*	List<Cus> c = new ArrayList<>();
		c.add(new Employee());
		check.gk1(c);*/

		/*List<Object> c = new ArrayList<>();
		c.add(new Man());
		check.gk1(c);*/
		 
		/*List<Cus> c = new ArrayList<>();
		  c.add(new Cus());
		check.gk(c);*/
	}

	public Boolean mk(int i) {
		return i > 5 ? true : i > 4 ? true : null;
	}

	public void gk(List<? extends Man> t) {
		t.add(null);
		System.out.println("hhh");
	}

	public void gk1(List<? super C> t) {
		System.out.println("super gk1 method");
	}
}

class Cus   {

}

class Employee  extends Cus 
{

}

class Man  extends Employee // implements C
{

}

interface C {

}
