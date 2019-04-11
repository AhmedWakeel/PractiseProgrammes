package com.generic.interfaces;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileNames {

	public static void main(String[] args) {
		
		Stream<Path> list1 = null;
		Stream<Path> list2 = null;
		
		try
		{
			list1 = Files.list(Paths.get("."));
			list1.forEach(System.out::println);
			
			System.out.println("------------");
			
			 Files.list(Paths.get("D:\\hybris_castle\\Castle_Bitbucket_Clone")).forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
