package com.stream.winterbe;

public abstract class Abct {

	protected abstract void mk();
}


interface INT1 {
	Object mm();
	public default void mk()
	{
		System.out.println("hi");
	}
}

interface INT // extends INT1
{
//	@Override
	String mm();
	
	
	public default void mk()
	{
		System.out.println("by");
	}
}

class Aa implements INT,INT1 {
	
	

	@Override
	public String mm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mk() {
		INT.super.mk();
	}

	public static void main(String[] args) {
		
		INT aa = new Aa();
		aa.mk();
	}
}


/*
 * class Bb extends Aa {
 * 
 * @Override void mk() {
 * 
 * }
 * 
 * }
 */