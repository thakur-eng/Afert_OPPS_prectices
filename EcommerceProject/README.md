Java E-Commerce Console Application

A complete console-based E-Commerce system developed using Core Java, JDBC, and MySQL. This project simulates the key features of an online shopping platform.

✅ Features

- User Registration & Login (with email uniqueness check)
- Product Browsing and Searching (Java 8 Streams)
- Shopping Cart (Add, View, Remove Items)
- Checkout & Order Placement (Multi-threading using Executor Service)
- Stock updates in database after checkout
- Order Processing with Shipment simulation
- Order History (View past orders with total cost)

💻 Technologies Used

- Java 8
- JDBC (Java Database Connectivity)
- MySQL Database
- Maven (Dependency Management)
- Console-based User Interface

 📂 Folder Structure

src/
├── main/
│ ├── java/
│ │ ├── model/ # POJO classes: User, Product, CartItem, Order
│ │ ├── service/ # Business logic: UserService, ProductService, CartService, OrderService
│ │ ├── db/ # DB connection utility
│ │ └── main/ # Entry points: Main.java, UserMain.java, ProductMain.java, CartMain.java, CheckoutMain.java
pom.xml # Maven configuration

 🛠️ Setup Instructions

1. Install MySQL and create the database `ecommerce_db`
2. Run the SQL schema to create tables: users, products, orders, order_items
3. Insert some sample product data
4. Clone or download this project and open it in Eclipse (as a Maven project)
5. Update `DBConnection.java` with your DB credentials
6. Run `Main.java` to start the full flow

🧾 Database Tables 

- `users` — stores registered users
- `products` — stores product catalog
- `orders` — stores placed orders
- `order_items` — stores product line-items for each order

👤 Author
**Ashish Thakur**  
Email: ashishthakurofficial.in@gmail.com 
LinkedIn: https://www.linkedin.com/in/ashish-thakur-3b468b201/
Github: https://github.com/thakur-eng
 
