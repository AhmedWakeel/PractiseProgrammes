package com.test;

public class LambdathisRefernece {
	
	
	
	public static void main(String[] args) {
		
		/*int i = 20;
		doPass(i,x ->{
			System.out.println();
			});*/
	    new LambdathisRefernece().mk2();
	}

	private static void doPass(int i,ClosureInterface p) {
		
		p.mk(i);
	}

	public void mk2()
	{
		int i = 40;
		System.out.println(this);
		doPass(i,x ->{
			System.out.println(this);
			});
	}
}
