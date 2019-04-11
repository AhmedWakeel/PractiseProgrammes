package com.generic.test;

public class GenericMain {

	static <T, V extends T> boolean isIn(T x, V[] y) {
	    for (int i = 0; i < y.length; i++) {
	      if (x.equals(y[i])) {
	        return true;
	      }//  w  ww .java 2  s . c om
	    }
	    return false;
	  }

	  public static void main(String args[]) {
	    Integer nums[] = { 1, 2, 3, 4, 5 };
	    String[] ss = {"ef"};
	    if (isIn(new Integer(20), ss)){
	      System.out.println("2 is in nums");
	    }
	    String strs[] = { "one", "two", "three", "four", "five" };
	    if (isIn(3, ss)){
	      System.out.println("two is in strs");
	    }
	  }
	
	
	/*static < Test1dhsdhuhu extends T, V, T > boolean isIn(T x, V[] y) {
//		<T, Number extends V>
		for (int i = 0; i < y.length; i++) {
			if (x.equals(y[i])) {
				return true;
			} 
		}
		return false;
	}
	public <D extends Test1 > void sk(D d)
	{
		
	}

	public static void main(String args[]) {
		Integer nums[] = { 1, 2, 3, 4, 5 };
		Integer i = new Integer(3);
		int[][] ii = {{}};
		
		System.out.println(ii.getClass().getSuperclass().getName());
		String[] sr = {"one","hello"}; 
		if (isIn(new Type(), nums)) {
			System.out.println("2 is in nums");
		}
		String strs[] = { "one", "two", "three", "four", "five" };
		if (isIn("two", nums)) {
			System.out.println("two is in strs");
		}
	}*/
}

class Test1 extends Type
{
	
}
class Type extends Ahmed
{
	
}
class Ref extends Test1
{
}
class Ahmed 
{
	
}
class Ret extends Type
{
	
}
//A  T T1 Ref