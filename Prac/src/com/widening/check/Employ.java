package com.widening.check;

public class Employ {

	int i ;
	String name;
	int age;
	
	public Employ(int i, String name, int age) {
		this.i = i;
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object object) {
		   
		   if(this == object)
			   return true;
		     if(this.i == ((Employ)object).i && name == ((Employ)object).name)
		    	 return true;
		   
		return true;
		
	}
	
	public static void main(String[] args) {
		Employ employ1 = new Employ(10, "mk", 20);
		Employ employ2 = new Employ(10, "mk", 200);
		
		/*Integer integer = new Integer(2);
		Integer integer1 = new Integer(2);
//		Integer integer1 = 2;
		Number float1    = 2.0f;
		Number float2    = 2.0f;
		System.out.println(integer1==integer);*/
		
	}
}
