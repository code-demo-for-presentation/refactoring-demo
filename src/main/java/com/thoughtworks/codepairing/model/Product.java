package com.thoughtworks.codepairing.model;

public class Product {
    private final double price;
    private final String productCode;
    private final String name;

    public Product(double price, String productCode, String name) {
        this.price = price;
        this.productCode = productCode;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public double getDiscountedPrice() {
        double totalPrice = 0;
            double discount = 0;
            if (this.getProductCode().startsWith("DIS_10")) {
                discount = (this.getPrice() * 0.1);
            } else if (this.getProductCode().startsWith("DIS_15")) {
                discount = (this.getPrice() * 0.15);
            } else if (this.getProductCode().startsWith("DIS_20")) {
                discount = (this.getPrice() * 0.20);
            }
            totalPrice += this.getPrice() - discount;
        return totalPrice;
    }

    public int getEarnedLoyaltyPoints() {
        int loyaltyPointsEarned = 0;
        if (this.getProductCode().startsWith("DIS_10")) {
            loyaltyPointsEarned += (this.getPrice() / 10);
        } else if (this.getProductCode().startsWith("DIS_15")) {
            loyaltyPointsEarned += (this.getPrice() / 15);
        } else if (this.getProductCode().startsWith("DIS_20")) {
            loyaltyPointsEarned += (this.getPrice() / 20);
        } else {
            loyaltyPointsEarned += (this.getPrice() / 5);
        }
        return loyaltyPointsEarned;
    }

}
