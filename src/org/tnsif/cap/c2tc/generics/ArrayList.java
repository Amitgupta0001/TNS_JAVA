package org.tnsif.cap.c2tc.generics;

import java.util.List;

public class ArrayList {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List list = new java.util.ArrayList(); // Use java.util.ArrayList instead of the local class
		list.add("abc");
		list.add(new Integer(5));
		
		try {
			for (Object obj : list) {
				// type casting leading to ClassCastException at runtime
				String str = (String) obj;
			}
		} catch (ClassCastException e) {
			System.out.println("Caught Expected Exception: " + e.getMessage());
		}

	}

}