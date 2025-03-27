package com.bridgelabz.onlinemarketplace;

class ProductCatalog<T extends Product<?>> {
    private T product;

    public ProductCatalog(T product) {
        this.product = product;
    }

    public void displayProduct() {
        product.displayProduct();
    }

    // Generic method to apply discounts dynamically
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getName() + " is $" + newPrice);
    }
}
/*--- Product Catalog ---
Book: The Alchemist | Author: Paulo Coelho | Category: Fiction | Price: $15.99
Clothing: T-Shirt | Size: L | Category: Men | Price: $9.99
Gadget: iPhone 13 | Brand: Apple | Category: Mobile | Price: $799.99

--- Applying Discounts ---
Discount applied! New price of The Alchemist is $14.391
Discount applied! New price of T-Shirt is $9.4905
Discount applied! New price of iPhone 13 is $679.9915

--- Updated Product Prices ---
Book: The Alchemist | Author: Paulo Coelho | Category: Fiction | Price: $14.391
Clothing: T-Shirt | Size: L | Category: Men | Price: $9.4905
Gadget: iPhone 13 | Brand: Apple | Category: Mobile | Price: $679.9915
 */