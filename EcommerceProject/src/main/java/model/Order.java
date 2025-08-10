package model;

import java.util.List;

// Model class representing an Order
public class Order {
    private int id;                     // Unique ID for the order
    private int userId;                 // ID of the user who placed the order
    private String status;              // Current status of the order (e.g., Pending, Completed)
    private List<CartItem> items;       // List of items included in the order

    // Constructor to create a new order with user ID and list of cart items
    public Order(int userId, List<CartItem> items) {
        this.userId = userId;
        this.items = items;
        this.status = "Pending"; // Default status is 'Pending' when order is created
    }

    // Getter for userId
    public int getUserId() { 
        return userId; 
    }

    // Getter for list of CartItems in the order
    public List<CartItem> getItems() { 
        return items; 
    }

    // Getter for order status
    public String getStatus() { 
        return status; 
    }

    // Setter to update order status
    public void setStatus(String status) { 
        this.status = status; 
    }
}
