package com.bridgelabz.onlinemarketplace;

class Gadget extends Product<String> {
    private String brand;

    public Gadget(String name, double price, String category, String brand) {
        super(name, price, category);
        this.brand = brand;
    }

    @Override
    public void displayProduct() {
        System.out.println("Gadget: " + getName() + " | Brand: " + brand + " | Category: " + getCategory() + " | Price: $" + getPrice());
    }
}
