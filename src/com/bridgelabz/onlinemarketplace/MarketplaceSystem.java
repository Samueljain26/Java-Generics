package com.bridgelabz.onlinemarketplace;

public class MarketplaceSystem {
    public static void main(String[] args) {
        // Creating different products
        Book book1 = new Book("The Alchemist", 15.99, "Fiction", "Paulo Coelho");
        Clothing tshirt = new Clothing("T-Shirt", 9.99, "Men", "L");
        Gadget phone = new Gadget("iPhone 13", 799.99, "Mobile", "Apple");

        // Storing products in the catalog
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>(book1);
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>(tshirt);
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>(phone);

        // Display all products
        System.out.println("\n--- Product Catalog ---");
        bookCatalog.displayProduct();
        clothingCatalog.displayProduct();
        gadgetCatalog.displayProduct();

        // Apply discount using a generic method
        System.out.println("\n--- Applying Discounts ---");
        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(tshirt, 5);
        ProductCatalog.applyDiscount(phone, 15);

        // Display products after discount
        System.out.println("\n--- Updated Product Prices ---");
        bookCatalog.displayProduct();
        clothingCatalog.displayProduct();
        gadgetCatalog.displayProduct();
    }
}
