package com.method;

public interface Interf  {
	
	/* (non-Javadoc)
	 * @see com.method.Interf2#mk(java.lang.String)
	 */
	default void mk(String name)
	{
		System.out.println("inside intef ");
		System.out.println(name);
	}
	
	public static void sk()
	{
		System.out.println("inside static method");
	}

}
