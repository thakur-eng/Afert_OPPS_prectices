package service;

import model.CartItem;
import model.Product;

import java.util.*;

public class CartService {
    // Singleton instance of CartService
    private static CartService instance;

    // Map to store cart items: Key = Product ID, Value = CartItem
    private final Map<Integer, CartItem> cart = new LinkedHashMap<>();

    // Private constructor to prevent external instantiation
    private CartService() {}

    // Method to get the single instance of CartService (Singleton Pattern)
    public static CartService getInstance() {
        if (instance == null) {
            instance = new CartService();
        }
        return instance;
    }

    // Method to add a product to the cart with specified quantity
    public void addToCart(Product product, int quantity) {
        // Check if requested quantity is available in stock
        if (product.getStock() < quantity) {
            System.out.println("❌ Not enough stock!");
            return;
        }

        // If product already exists in cart, update its quantity
        if (cart.containsKey(product.getId())) {
            CartItem existing = cart.get(product.getId());
            int newQty = existing.getQuantity() + quantity;
            cart.put(product.getId(), new CartItem(product, newQty));
        } else {
            // If product not in cart, add as new item
            cart.put(product.getId(), new CartItem(product, quantity));
        }
        System.out.println("✅ Added to cart: " + product.getName());
    }

    // Method to display all items in the cart along with total amount
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("🛒 Cart is empty!");
            return;
        }

        double total = 0;
        System.out.println("🛒 Your Cart:");
        for (CartItem item : cart.values()) {
            System.out.println(item.getProduct().getName() + " | Qty: " + item.getQuantity() + " | ₹" + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }

    // Method to remove a product from the cart by its product ID
    public void removeFromCart(int productId) {
        if (cart.containsKey(productId)) {
            cart.remove(productId);
            System.out.println("✅ Removed from cart.");
        } else {
            System.out.println("❌ Product not in cart.");
        }
    }

    // Method to get all cart items (useful for other operations like checkout)
    public Map<Integer, CartItem> getCartItems() {
        return cart;
    }
}
