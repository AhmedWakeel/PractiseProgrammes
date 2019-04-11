package com.interfaceCheck;

import com.interfaceCheck.Interf1.Interf2;

interface Interf1 {

	  static int i = 20;
	  int i1 = 34;
       interface Interf2
	{
		/**
		 * this is the default method inside the static initerface which can be access
		 */
		default void mk()
		{
			System.out.println(i1);
		}
	}
}

  class Main implements Interf1.Interf2
  {
	  public static void main(String[] args) {
		
//		  Interf1.Interf2 interf2 = new Main();
		  Interf2 interf2 = new Main();
//		  Interf1.Interf2.mk();
		  	interf2.mk();
	}
  }