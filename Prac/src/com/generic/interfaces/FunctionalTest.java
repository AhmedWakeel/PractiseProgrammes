package com.generic.interfaces;

@FunctionalInterface
public interface FunctionalTest {

	void mk();
}

interface FunctionalTestImp extends FunctionalTest
{
	boolean equal(Object obj);
	
}