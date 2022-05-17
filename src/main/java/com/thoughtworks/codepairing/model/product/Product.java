package com.thoughtworks.codepairing.model.product;

public abstract class Product {
    private final double price;
    private final String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract double getDiscountedPrice();

    public abstract int getEarnedLoyaltyPoints();

}
