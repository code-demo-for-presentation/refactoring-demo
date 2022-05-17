package com.thoughtworks.codepairing.model.product;

public class ProductWithDiscount15Percent extends Product {
    public ProductWithDiscount15Percent(double price, String name) {
        super(price, name);
    }

    @Override
    public double getDiscountedPrice() {
        return this.getPrice() * 0.85;
    }

    @Override
    public int getEarnedLoyaltyPoints() {
        return (int) this.getPrice() / 15;
    }
}



