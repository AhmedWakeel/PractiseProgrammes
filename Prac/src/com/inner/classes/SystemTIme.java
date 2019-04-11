package com.inner.classes;

public class SystemTIme {

	public static void main(String[] args) {
		
		long StartTime = System.currentTimeMillis();
		int i;
		for(i = 0 ; i<1000000;i++)
		{
			System.out.print("hi");
		}
		System.out.println();
		long finalTimeInMinutes = System.currentTimeMillis();
        System.out.println((finalTimeInMinutes-StartTime)/1000+" ms");
	}
}
