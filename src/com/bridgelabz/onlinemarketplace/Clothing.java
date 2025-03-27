package com.bridgelabz.onlinemarketplace;

class Clothing extends Product<String> {
    private String size;

    public Clothing(String name, double price, String category, String size) {
        super(name, price, category);
        this.size = size;
    }

    @Override
    public void displayProduct() {
        System.out.println("Clothing: " + getName() + " | Size: " + size + " | Category: " + getCategory() + " | Price: $" + getPrice());
    }
}
