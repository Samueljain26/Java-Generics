package com.bridgelabz.smartwarehouse;

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayItem() {
        System.out.println("Grocery: " + getName() + " | Expiry: " + expiryDate + " | Price: $" + getPrice());
    }
}
