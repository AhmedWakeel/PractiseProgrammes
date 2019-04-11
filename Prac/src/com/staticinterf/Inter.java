package com.staticinterf;

public interface Inter {
	
	void ma();
	boolean equals(Object object);
	
	public static void mk()
	{
		System.out.println("inside mk method");
	}
	
	 default void md()
	 {
		 System.out.println("inside the default method");
	 }
	
	/*default int hashCode(){
		
		return 1;
	}*/

}
