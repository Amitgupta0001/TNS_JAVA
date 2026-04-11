package org.tnsif.cap.c2tc.exceptionhandlingdemo;

// Using fully qualified java.io.IOException to avoid conflict with local java.io.IOException class

public class ThrowsDemo {
	// hema
	void m1() // No exception
	{
		System.out.println("No Exception");
	}

	// vishu
	void m2() throws java.io.IOException {
		System.out.println("Device error");
	}

	// Pamu sai
	void m3() throws ArithmeticException, java.io.IOException, ClassNotFoundException {
		System.out.println("File not Found");
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		obj.m1();
		try {
			obj.m2();
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			obj.m3();
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (java.io.IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
