package com.bridgelabz.onlinemarketplace;

class Book extends Product<String> {
    private String author;

    public Book(String name, double price, String category, String author) {
        super(name, price, category);
        this.author = author;
    }

    @Override
    public void displayProduct() {
        System.out.println("Book: " + getName() + " | Author: " + author + " | Category: " + getCategory() + " | Price: $" + getPrice());
    }
}
