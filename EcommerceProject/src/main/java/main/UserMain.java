 package main;

import model.User;
import service.UserService;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();

        System.out.println("1. Register\n2. Login");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.println("Enter Email:");
            String email = sc.nextLine();
            System.out.println("Enter Password:");
            String password = sc.nextLine();

            User newUser = new User(name, email, password);
            boolean success = userService.registerUser(newUser);
            System.out.println(success ? "✅ Registered Successfully!" : "❌ Registration Failed.");

        } else if (choice == 2) {
            System.out.println("Enter Email:");
            String email = sc.nextLine();
            System.out.println("Enter Password:");
            String password = sc.nextLine();

            User user = userService.loginUser(email, password);
            if (user != null) {
                System.out.println("✅ Login Success! Welcome " + user.getName());
            } else {
                System.out.println("❌ Invalid credentials.");
            }
        }
    }
}
