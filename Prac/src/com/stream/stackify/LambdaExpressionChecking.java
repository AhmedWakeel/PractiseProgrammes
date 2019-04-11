package com.stream.stackify;

public class LambdaExpressionChecking {

	int i = 30;
	public String  mk1() {
		
		int i = 10;
		Lm lm = (x) -> "hi "+x;
		System.out.println(this);
		lm.mk("Sachin");
		return "ji";
	}
	
	public static void main(String[] args) {
		
		 new LambdaExpressionChecking().mk1();
		
		
	}
}

interface Lm
{
	public String  mk(String i);
}