package org.tnsif.cap.c2tc.oop;

class PersonDemo1 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

public class ThisDemo1 {

	public static void main(String[] args) {
		PersonDemo1 obj = new PersonDemo1();
		obj.setName("alice");
		obj.setAge(20);
		obj.setName("joel");
		obj.setAge(30);
		obj.displayDetails();
	}

}