package com.innerclasses;

import com.innerclasses.OuterClass.InnerClass;

public class MainInner {

     public static void main(String[] args) {
		
    	 OuterClass.InnerClass class1 = new OuterClass().new InnerClass();
    	 class1.invoke(); 
	}
	
}
