package com.overridingexceptionrules;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionThrowing {

	public static void main(String[] args) {

		File file = new File("");
		try {
			readFile(file);
		} catch (FileNotFoundException e) {
			System.out.println("inside FilenotFoundException");
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("inside IllegalArgumentExceptionfffffdf");
			e.printStackTrace();
			}
			
    	} 
	
	private static void readFile(File file) throws FileNotFoundException, EOFException, IllegalArgumentException {

		if (file == null || file.getPath().equals("")) {
			throw new IllegalArgumentException("File name is not found");
		}
		InputStream inputStream = new FileInputStream(file);
	}
}
