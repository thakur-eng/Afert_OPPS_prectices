 package service;

import db.DBConnection;
import model.CartItem;
import model.Order;

import java.sql.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderService {

    private final ExecutorService executor = Executors.newFixedThreadPool(3);

    public void placeOrder(Order order) {
        executor.submit(() -> {
            try (Connection conn = DBConnection.getConnection()) {
                conn.setAutoCommit(false);

                String insertOrder = "INSERT INTO orders (user_id, status) VALUES (?, ?)";
                PreparedStatement orderStmt = conn.prepareStatement(insertOrder, Statement.RETURN_GENERATED_KEYS);
                orderStmt.setInt(1, order.getUserId());
                orderStmt.setString(2, order.getStatus());
                orderStmt.executeUpdate();

                ResultSet keys = orderStmt.getGeneratedKeys();
                keys.next();
                int orderId = keys.getInt(1);

                for (CartItem item : order.getItems()) {
                    // Insert order item
                    String insertItem = "INSERT INTO order_items (order_id, product_id, quantity) VALUES (?, ?, ?)";
                    PreparedStatement itemStmt = conn.prepareStatement(insertItem);
                    itemStmt.setInt(1, orderId);
                    itemStmt.setInt(2, item.getProduct().getId());
                    itemStmt.setInt(3, item.getQuantity());
                    itemStmt.executeUpdate();

                    // Update stock
                    String updateStock = "UPDATE products SET stock = stock - ? WHERE id = ?";
                    PreparedStatement stockStmt = conn.prepareStatement(updateStock);
                    stockStmt.setInt(1, item.getQuantity());
                    stockStmt.setInt(2, item.getProduct().getId());
                    stockStmt.executeUpdate();
                }

                // Simulate processing
                Thread.sleep(2000);
                String updateOrder = "UPDATE orders SET status = 'Shipped' WHERE id = ?";
                PreparedStatement statusStmt = conn.prepareStatement(updateOrder);
                statusStmt.setInt(1, orderId);
                statusStmt.executeUpdate();

                conn.commit();
                System.out.println("✅ Order placed & processed (ID: " + orderId + ")");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void shutdown() {
        executor.shutdown();
    }


public void showOrderHistory(int userId) {
    try (Connection conn = DBConnection.getConnection()) {
        String orderSql = "SELECT * FROM orders WHERE user_id = ? ORDER BY order_date DESC";
        PreparedStatement orderStmt = conn.prepareStatement(orderSql);
        orderStmt.setInt(1, userId);
        ResultSet orderRs = orderStmt.executeQuery();

        while (orderRs.next()) {
            int orderId = orderRs.getInt("id");
            String status = orderRs.getString("status");
            Timestamp date = orderRs.getTimestamp("order_date");

            System.out.println("\n🧾 Order ID: " + orderId + " | Status: " + status + " | Date: " + date);

            String itemSql = "SELECT p.name, oi.quantity, p.price " +
                    "FROM order_items oi JOIN products p ON oi.product_id = p.id " +
                    "WHERE oi.order_id = ?";
            PreparedStatement itemStmt = conn.prepareStatement(itemSql);
            itemStmt.setInt(1, orderId);
            ResultSet itemRs = itemStmt.executeQuery();

            double total = 0;
            while (itemRs.next()) {
                String name = itemRs.getString("name");
                int qty = itemRs.getInt("quantity");
                double price = itemRs.getDouble("price");
                double sub = qty * price;
                total += sub;
                System.out.println(" - " + name + " | Qty: " + qty + " | ₹" + sub);
            }

            System.out.println("Total: ₹" + total);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}