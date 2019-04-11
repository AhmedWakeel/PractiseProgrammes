package com.overridingexceptionrules;

import java.sql.SQLException;

public class A {
	

	public void  m1() throws RuntimeException, Exception
	{
		System.out.println("inside m1");
	}
	
	public void m2() throws SQLException, Exception
	{
		System.out.println("inside m2");
	}
}
