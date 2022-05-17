package com.thoughtworks.codepairing.model.product;

public class ProductWithNoDiscount extends Product {
    public ProductWithNoDiscount(double price, String name) {
        super(price, name);
    }

    @Override
    public double getDiscountedPrice() {
        return this.getPrice();
    }

    @Override
    public int getEarnedLoyaltyPoints() {
        return (int) (this.getPrice() / 5);
    }
}
