package com.thoughtworks.codepairing.model.product;

public class ProductWithDiscount10Percent extends Product {
    public ProductWithDiscount10Percent(double price, String productCode, String name) {
        super(price, productCode, name);
    }

    @Override
    public double getDiscountedPrice() {
        return this.getPrice() * 0.9;
    }

    @Override
    public int getEarnedLoyaltyPoints() {
        return (int) (this.getPrice() / 10);
    }
}
