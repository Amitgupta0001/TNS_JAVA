package org.tnsif.cap.c2tc.oop;

class Animal5
{
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog5 extends Animal5
{
	void makeSound()
	{
		super.makeSound();
		System.out.println("Dog barks");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		Dog5 obj=new Dog5();
		obj.makeSound();
	}

}