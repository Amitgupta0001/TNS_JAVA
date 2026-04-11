package org.tnsif.cap.c2tc.oop;

class InstPerson
{
	
}
class InstEmployee extends InstPerson
{
	
}

class InstManager extends InstEmployee
{
	
}
public class Instance {

	public static void main(String[] args) {
		InstPerson person =new InstPerson();
		InstEmployee employee =new InstEmployee();
		 InstManager manager =new  InstManager();
		 System.out.println(employee instanceof InstEmployee); // T
		 System.out.println(employee instanceof InstPerson);  //T
		 System.out.println(employee instanceof InstManager); //F
		 System.out.println(manager instanceof InstManager); //T
		 System.out.println(manager instanceof InstEmployee);  //T
		 System.out.println(manager instanceof InstPerson); //T
		 System.out.println(person instanceof InstEmployee); //F
		 System.out.println(person instanceof 	InstManager); //F
		 
		 
		 
	}

}
