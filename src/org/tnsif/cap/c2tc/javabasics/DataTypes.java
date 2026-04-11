package org.tnsif.cap.c2tc.javabasics;

public class DataTypes {
	public static void main(String[] args) {
		//primitive datatype
		int orderid=101;
		double price=299.99;
		boolean Delivered = false;
		char rating ='A';
		float deliveryDistance=5.3f;
		long deliveryBoyNumber =9327382829l;
		byte deliverTime =45;
		short restaurantid =12;
		
		//no primitve datatype
		
		String customerName ="Nitin "; //string
		String[] fooditems= {"Burger","Fries","coke"};//array
		
		System.out.println("Order Summary");
		System.out.println("Customer Name " +customerName);
		System.out.println("Order id "+orderid);
		System.out.println("Restaurantid "+restaurantid );
		System.out.println("Delivery Boy Number "+deliveryBoyNumber);
		System.out.println("Food items :");
		for (String items: fooditems)
		{
			System.out.println(items);
		}
		System.out.println("Total Price "+price);
		System.out.println("Delivery Distance "+deliveryDistance);
		System.out.println("Expected time "+deliverTime);
		System.out.println("Rating "+rating);

	}


}
