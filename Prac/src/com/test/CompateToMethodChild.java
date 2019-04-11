package com.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompateToMethodChild extends CompateToMethod {

	String address;
	Integer id;
	
	

	public CompateToMethodChild(String address, Integer id) {
		super();
		this.address = address;
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CompateToMethodChild [address=" + address + ", id=" + id + "]";
	}
	
	
}
