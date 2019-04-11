package com.innerclasses;

public class NestedInterface {

	public static interface InnerInterface
	{
		public void mk();
	}
}

class Outer implements NestedInterface.InnerInterface
{
	public static void main(String[] args) {
		
		NestedInterface.InnerInterface innerInterface = new Outer();
		
		innerInterface.mk();
	}

	@Override
	public void mk() {

		System.out.println("inside override mk method");
	}
	
	
}

