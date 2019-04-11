package com.generic.interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		
//		Supplier<Integer> supplier = SupplierInterface::getNum;
		Supplier<Integer> supplier = () -> 
		{
			Random random = new Random();
			int nextInt = random.nextInt(100);
			return  nextInt;
		};
		
		for(int i = 0; i<10 ; i++)  
		{
			System.out.println(supplier.get());
		}
	}
	
	public static Integer getNum()
	{
		Random random = new Random();
		int nextInt = random.nextInt(100);
		return  nextInt;
	}
	
}
