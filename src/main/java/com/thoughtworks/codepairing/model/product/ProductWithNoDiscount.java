package com.thoughtworks.codepairing.model.product;

public class ProductWithNoDiscount extends Product {
    public ProductWithNoDiscount(double price, String productCode, String name) {
        super(price, productCode, name);
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
