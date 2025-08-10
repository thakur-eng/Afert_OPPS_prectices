 package main;

import model.Product;
import service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);

        System.out.println("1. View All Products\n2. Search Product");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            List<Product> all = productService.getAllProducts();
            for (Product p : all) {
                System.out.println(p.getId() + " | " + p.getName() + " | " + p.getCategory() + " | ₹" + p.getPrice() + " | Stock: " + p.getStock());
            }
        } else if (choice == 2) {
            System.out.println("Enter search keyword:");
            String keyword = sc.nextLine();
            List<Product> filtered = productService.searchProducts(keyword);
            for (Product p : filtered) {
                System.out.println(p.getId() + " | " + p.getName() + " | " + p.getCategory() + " | ₹" + p.getPrice() + " | Stock: " + p.getStock());
            }
        }
    }
}
