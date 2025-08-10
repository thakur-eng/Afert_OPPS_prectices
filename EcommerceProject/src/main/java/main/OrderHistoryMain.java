 package main;

import service.OrderService;

public class OrderHistoryMain {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        // Assuming user is logged in and userId is 1
        int userId = 1;

        System.out.println("📦 Your Order History:");
        orderService.showOrderHistory(userId);
    }
}
