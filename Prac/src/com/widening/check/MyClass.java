package com.widening.check;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

	private final String importantField;
	private final String anotherField;

	public MyClass(final String equalField, final String anotherField) {
		this.importantField = equalField;
		this.anotherField = anotherField;
	}

	public String getEqualField() {
		return importantField;
	}

	public String getAnotherField() {
		return anotherField;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((importantField == null) ? 0 : importantField.hashCode());
		System.out.println("hashCode of the object is "+result);
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final MyClass other = (MyClass) obj;
		if (importantField == null) {
			if (other.importantField != null)
				return false;
		} else if (!importantField.equals(other.importantField))
			return false;
		return true;
	}
	public static void main(String[] args) {
		
		MyClass class1 = new  MyClass("ab", "bc");
		MyClass class2 = new  MyClass("ab", "bc");
		
		Map<Integer, MyClass> map = new HashMap<>();
		map.put(1, class1);
		map.put(2, class2);
		
	}
}