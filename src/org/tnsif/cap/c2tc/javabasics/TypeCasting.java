package org.tnsif.cap.c2tc.javabasics;

public class TypeCasting {
	public static void main(String[] args) {
		//widening (small -large)
		int quantity=3;
		double priceperitem =99.5;
		double totalprice = quantity*priceperitem; //int -double
		
		System.out.println("Totalprice with widening "+totalprice);
		
		//narrowing
		
		double discount=10.75;
		int roundeddiscount = (int) discount;
		
	
		double finalAmount = totalprice-roundeddiscount;
		System.out.println("Final price after narrowing "+roundeddiscount);
		

	}

}
