package com.generic.interfaces;

public class LambdaEnclosing {

	    private String name = "instance variable";    
	    int k = 30;
	   public static void main(String[] args) {
		
		   new LambdaEnclosing().lm();
	}
	   
	   public void lm()
	   {
		   LambdaCheck lambdaCheck = new LambdaCheck() {
			   private String name = "annonymous variable of";    
			@Override
			public String mk() {
				return this.name;
			}
		};
        System.out.println(lambdaCheck.mk());
		
//        int k = 30;
        LambdaCheck lambdaCheck2 = () -> 
        {
        	k = 34;
        	String name = "inside lambda ";
        	return this.name;
        };
         System.out.println(lambdaCheck2.mk());
	   }
}

interface LambdaCheck
{
	String mk();
}
