package org.tnsif.cap.c2tc.finalKeyword;

public class FinalVar {

	public static void main(String[] args) {
		final int num = 8;
		// num = 9; //Cannot assign a value to final variable 'num'
		System.out.println("Final variable value: " + num);
	}


}
