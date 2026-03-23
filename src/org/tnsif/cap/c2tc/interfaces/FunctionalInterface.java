package org.tnsif.cap.c2tc.interfaces;

class GreetingsImp implements InterfaceDemo3
{

	@Override
	public void sayHello(String Name) {
		System.out.println("Hello" + "   "+ Name + " !");
		
	}
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		InterfaceDemo3 obj=new GreetingsImp();
		obj.sayHello("Vishu");

	}

}