package com.lambda;

import java.security.interfaces.RSAKey;

public class LambdaTest {

	int id;
	String name;
	
	
	/*@Override
	public String toString() {
		return "LambdaTest [id=" + id + ", name=" + name + "]";
	}*/

	
	public LambdaTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public void rs() {
		
		System.out.println(this);
		
		/*Intr intr = new Intr() {
			
			@Override
			public void mk() {
                
				System.out.println(this);
			}
		};
		*/
		Intr intr = () -> System.out.println(this);
		intr.mk();
		
	}
	
	public static void main(String[] args)
	{
		LambdaTest lambdaTest = new LambdaTest(20,"malik");
		lambdaTest.rs();
		System.out.println(lambdaTest);
	}
}

interface Intr
{
	public void mk();
}