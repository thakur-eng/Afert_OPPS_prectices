package main;

import model.CartItem;
import model.Order;
import service.CartService;
import service.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckoutMain {
    public static void main(String[] args) {
        CartService cartService = CartService.getInstance(); // Singleton
        OrderService orderService = new OrderService();
        Scanner sc = new Scanner(System.in);

        // Simulate a logged-in user (hardcoded for now)
        int userId = 1;

        System.out.println("🛒 Ready to Checkout?");
        cartService.viewCart();

        System.out.println("Confirm order? (yes/no)");
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            List<CartItem> cartItems = new ArrayList<>(cartService.getCartItems().values());

            if (cartItems.isEmpty()) {
                System.out.println("❌ Your cart is empty.");
                return;
            }

            Order order = new Order(userId, cartItems);
            orderService.placeOrder(order);
        } else {
            System.out.println("❌ Checkout cancelled.");
        }

        Runtime.getRuntime().addShutdownHook(new Thread(orderService::shutdown));
    }
}
