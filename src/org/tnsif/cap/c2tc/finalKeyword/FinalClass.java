package org.tnsif.cap.c2tc.finalKeyword;

final class ImplementByHema
{
	public void show()
	{
		System.out.println("Ai integration done by hema");
	}
}
// class Vishu extends ImplementByHema  Compile Error: Cannot inherit from final class
// {
//     public void show() { System.out.println("Ai integration done by vishu"); }
// }

public class FinalClass {

	public static void main(String[] args) {
		ImplementByHema obj = new ImplementByHema();
		obj.show(); // Output: Ai integration done by hema
	}

}