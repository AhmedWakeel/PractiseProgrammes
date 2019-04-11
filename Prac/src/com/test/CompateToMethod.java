package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompateToMethod implements Comparable<CompateToMethod>{

	Integer id ;
	String name ;
	
	public CompateToMethod() {
	}
	
	public CompateToMethod(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CompateToMethod [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(CompateToMethod o) {
//		return this.getId().compareTo(o.getId());
		return this.getName().compareTo(o.getName());
	}
	
	public static void main(String[] args) {
		
		List<CompateToMethod> ls = new ArrayList<>();
		ls.add(new CompateToMethod(5, "malik"));
		ls.add(new CompateToMethod(6, "sk"));
		ls.add(new CompateToMethod(6, "bk"));
		ls.add(new CompateToMethod(6, "ak"));
		
		Collections.sort(ls);
//		Collections.binarySearch(ls, "ak");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
