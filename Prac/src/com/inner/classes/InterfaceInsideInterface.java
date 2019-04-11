package com.inner.classes;

public interface InterfaceInsideInterface {

	public void m1();
	
	interface InsideInterface
	{
		public void m2();
	}
}

class Im implements InterfaceInsideInterface,InterfaceInsideInterface.InsideInterface
{

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
class In implements InterfaceInsideInterface
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

class Client
{
	public static void main(String[] args) {
		
		Im im = new Im();
		im.m1();
		
		In in = new In();
		in.m1();
		
		
	}
}