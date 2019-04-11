package com.staticinterf;

public class ImplClass implements Inter {

	@Override
	public void ma() {
		// TODO Auto-generated method stub
	}
	

	public static void main(String[] args) {
		
		ImplClass implClass = new ImplClass();
		implClass.md();
		Inter.mk();
	}

}
