package com.stream.winterbe;

import java.util.HashMap;
import java.util.Map;

public class Test {

	private  Test()
	{
		
	}
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("ab");
		StringBuffer buffer2 = new StringBuffer(buffer);
		
		System.out.println(buffer.equals(buffer2));
		Map<String,Integer> mp = new HashMap<>();
//		mp.put("fd",);
	}
	
}
