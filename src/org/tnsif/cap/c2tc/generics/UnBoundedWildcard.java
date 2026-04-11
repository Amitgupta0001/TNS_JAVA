package org.tnsif.cap.c2tc.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildcard {

	public static void printList(List<?> list) {
		for (Object element : list) {
			System.out.println(element + " ");
		}
	}

	public static void main(String[] args) {
		// list of integer
		List<Integer> inlist = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Integer List:  ");
		printList(inlist);

		// list of string

		List<String> strlist = Arrays.asList("apple", "orange", "mango");
		System.out.println("String List:  ");
		printList(strlist);

	}

}