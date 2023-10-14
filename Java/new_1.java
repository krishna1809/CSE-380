 class Product {
     String name;
     double price;
     int quantity;

     Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for Product attributes

    // Additional methods specific to Product
}

 class OrderItem {
     String productName;
     double productPrice;
     int quantity;

     OrderItem(String productName, double productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    // Getters and setters for OrderItem attributes

    // Additional methods specific to OrderItem
}
