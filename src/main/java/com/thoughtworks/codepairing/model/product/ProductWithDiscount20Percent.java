package com.thoughtworks.codepairing.model.product;

public class ProductWithDiscount20Percent extends Product {
    public ProductWithDiscount20Percent(double price, String productCode, String name) {
        super(price, productCode, name);
    }

    @Override
    public double getDiscountedPrice() {
        return this.getPrice() * 0.8;
    }

    @Override
    public int getEarnedLoyaltyPoints() {
        return (int) (this.getPrice() / 20);
    }
}
