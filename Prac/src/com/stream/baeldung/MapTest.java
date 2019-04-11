package com.stream.baeldung;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	Map<String,Object> mp = new HashMap<>();
	
	public void set(String str, Object object) {
		mp.put(str, object);
	}
	
	public Object getAttribute(String str) {
		return mp.get(str);
	}
}

class Add
{
	
	public static void main(String[] args) {
		
		MapTest mapTest = new MapTest();
		
		mapTest.set("st", Boolean.TRUE);
		if(((Boolean) mapTest.getAttribute("st")).booleanValue())
		{
			System.out.println("hi");
		}
	}
}