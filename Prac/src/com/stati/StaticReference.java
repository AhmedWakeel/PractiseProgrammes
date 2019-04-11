package com.stati;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticReference {

	public static void main(String[] args) {
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
	/*	newSingleThreadExecutor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("in the run method");
			}
		});*/
		
//		newSingleThreadExecutor.execute(() -> System.out.println("in r"));
	Runnable r =	StaticReference::mk;
	newSingleThreadExecutor.execute(r);

//		newSingleThreadExecutor.execute(StaticReference::mk);

	
	}
	
	private static void mk()
	{
		System.out.println("inside mk");
	}
	
}
