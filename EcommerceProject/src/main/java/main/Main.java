package main;

import model.CartItem;
import model.Order;
import model.Product;
import service.CartService;
import service.OrderService;
import service.ProductService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService productService = new ProductService();
        CartService cartService = CartService.getInstance();
        OrderService orderService = new OrderService();

        int userId = 1;

        while (true) {
            System.out.println("\n1. View Products\n2. Add to Cart\n3. View Cart\n4. Remove from Cart\n5. Checkout\n6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    productService.getAllProducts().forEach(p ->
                            System.out.println(p.getId() + " | " + p.getName() + " | ₹" + p.getPrice() + " | Stock: " + p.getStock()));
                    break;

                case 2:
                    System.out.println("Enter Product ID to add:");
                    int pid = sc.nextInt();
                    System.out.println("Enter Quantity:");
                    int qty = sc.nextInt();
                    sc.nextLine();

                    Product selected = productService.getAllProducts().stream()
                            .filter(p -> p.getId() == pid)
                            .findFirst()
                            .orElse(null);

                    if (selected != null) {
                        cartService.addToCart(selected, qty);
                    } else {
                        System.out.println("❌ Product not found.");
                    }
                    break;

                case 3:
                    cartService.viewCart();
                    break;

                case 4:
                    System.out.println("Enter Product ID to remove:");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    cartService.removeFromCart(removeId);
                    break;

                case 5:
                    cartService.viewCart();
                    System.out.println("Confirm order? (yes/no)");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("yes")) {
                        List<CartItem> cartItems = new ArrayList<>(cartService.getCartItems().values());

                        if (cartItems.isEmpty()) {
                            System.out.println("❌ Your cart is empty.");
                            break;
                        }

                        Order order = new Order(userId, cartItems);
                        orderService.placeOrder(order);
                    } else {
                        System.out.println("❌ Checkout cancelled.");
                    }
                    break;

                case 6:
                    System.out.println("👋 Exiting...");
                    orderService.shutdown();
                    return;

                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
