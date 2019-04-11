package com.generic.collection;

public class FunctonCheck {
	   static int k = 20 ;
		public static void main(String[] args) {
			
			int i ;
			System.out.println(k);
			In  in = () -> 
			{
				k = 30;
			System.out.println("hi"+k);
			};
			in.mk();
		}
	}




interface In
{
	public void mk();
}
