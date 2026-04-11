package org.tnsif.cap.c2tc.finalKeyword;

class calc
{
	public final void show()
	{
		//code implementation
		System.out.println("AI integration done by hema");
	}
	public void add(int a ,int b)
	{
		System.out.println(a+b);
	}
}
class Advcalc extends calc
{
	// show() cannot be overridden — it is final in parent class calc
	public void add(int a, int b)
	{
		System.out.println("Advanced calc: welcome");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		calc c = new calc();
		c.show();       // calls final method: "AI integration done by hema"
		c.add(5, 3);    // output: 8

		Advcalc ac = new Advcalc();
		ac.show();      // inherited final method from calc
		ac.add(5, 3);   // overridden method in Advcalc: "Advanced calc: welcome"
	}

}