package com.bridgelabz.smartwarehouse;

import java.util.*;

public class WarehouseSystem {
    public static void main(String[] args) {
        // Creating different types of items
        Electronics laptop = new Electronics("Laptop", 1200.99, "Dell");
        Groceries apple = new Groceries("Apple", 2.99, "12/2025");
        Furniture chair = new Furniture("Chair", 79.99, "Wood");

        // Storing Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(laptop);

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(apple);

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(chair);

        // Using wildcard method
        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.add(laptop);
        allItems.add(apple);
        allItems.add(chair);

        System.out.println("All Warehouse Items: ");
        Storage.displayAllItems(allItems);
    }
}
/*--- All Warehouse Items ---
Electronics: Laptop | Brand: Dell | Price: 1200.99
Grocery: Apple | Expiry: 12/2025 | Price: $2.99
Furniture: Chair | Material: Wood | Price: $79.99
 */