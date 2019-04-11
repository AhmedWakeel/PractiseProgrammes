package com.collection.prac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapclass {

	public static void main(String[] args) {

//		 maptest();

//		linkedhashmap();
		
		Map<Integer,String> map = new TreeMap<>();
		
		map.put(10, "mk");
		map.put(101, "mk1");
		
		
		
		
		
	}

	private static void linkedhashmap() {
		Map map = new HashMap();

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		
        		
		Set entrySet = map.entrySet();
		Iterator iterator = entrySet.iterator();
		
		System.out.println(map.get(100));
		System.out.println(map.containsKey(100));
		System.out.println(map.containsValue("Amit"));
		System.out.println(map.size());
		
		
		for(Object obj :entrySet)
		{
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)obj;
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		
		/*while(iterator.hasNext())
		{
			Map.Entry<Integer, String> next =(Map.Entry<Integer, String>)iterator.next();
			System.out.println(next.getValue()+"-"+next.getKey());
			
		}*/
	}

	private static void maptest() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		for (Map.Entry<Integer, String> etr : entrySet) {
			System.out.println(etr.getValue() + "-" + etr.getKey());
		}

		/*
		 * while(iterator.hasNext()) { Entry<Integer, String> next =
		 * iterator.next();
		 * System.out.println(next.getKey()+"-"+next.getValue()); }
		 */

		/*
		 * for (Map.Entry m : map.entrySet()) { System.out.println(m.getKey() +
		 * " " + m.getValue()); }
		 */
	}
}
