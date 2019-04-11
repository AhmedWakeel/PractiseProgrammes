package com.generic.interfaces;

public interface GenInterface<E> {

	public void setName(E e);
	E getName();
}


class GenImp<String> implements GenInterface<String>
{
    String e;
    
	@Override
	public void setName(String e) {
	    this.e = e ;	
	}

	@Override
	public String getName() {
		return e;
	}
}

class MainGnImp
{
	public static void main(String[] args) {
		
		GenImp<String> genImp = new GenImp<>();
		genImp.setName("malik");
		System.out.println(genImp.getName());
	}
}

class MainGnImp1
{
	public static void main(String[] args) {
		
		GenImp<String> genImp = new GenImp<>();
		genImp.setName("Ahmed");
		System.out.println(genImp.getName());
	}
}
