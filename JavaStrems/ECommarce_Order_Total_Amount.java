package com.JavaStrems;

import java.util.Arrays;
import java.util.List;

class Order {

	int id;
	double amount;

	Order(int id, double amount) {
		this.id = id;
		this.amount = amount;

	}

	public double getAmount() { 
		return amount;
	}

}

public class ECommarce_Order_Total_Amount {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order(101, 223.9), new Order(102, 432.9), new Order(103, 223.9),
				new Order(104, 432.9), new Order(105, 223.9), new Order(106, 432.9), new Order(107, 223.9),
				new Order(108, 432.9), new Order(109, 223.9), new Order(110, 432.9));

		double totalAmount = orders.stream().mapToDouble(Order::getAmount).sum(); 

		System.out.println("Total Price : " + totalAmount);

	}

}
