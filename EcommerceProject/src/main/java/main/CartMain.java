package main;

import model.Product;
import service.CartService;
import service.ProductService;

import java.util.Scanner;

public class CartMain {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        CartService cartService = CartService.getInstance(); // Singleton
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. View Products\n2. Add to Cart\n3. View Cart\n4. Remove from Cart\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    for (Product p : productService.getAllProducts()) {
                        System.out.println(p.getId() + " | " + p.getName() + " | ₹" + p.getPrice() + " | Stock: " + p.getStock());
                    }
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
                    System.out.println("👋 Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
