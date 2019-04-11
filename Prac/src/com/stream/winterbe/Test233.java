package com.stream.winterbe;

public class Test233 {

	public static String mk(Integer i)
	{
		System.out.println("hi");
	
			/*if(i==null)
			{
				throw new UnknownIdentifierException("i am throwing the exception");
			}*/
		
		System.out.println("lasr");
		return "ww";
	}
	
	public static void main(String[] args) {
		
		int x = 0;
		
		/*x = x++;
		x = x++;*/
		System.out.println(x++);
		System.out.println(x++);
		int y = x;
		System.out.println(y);
		
		/*try {
			System.out.println(mk(null));
		} catch (UnknownIdentifierException e) {
			System.out.println("catches the exceptin in the calling");
		}*/
	}
}
