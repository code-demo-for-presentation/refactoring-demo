package com.thoughtworks.codepairing.model.product;

public class Product {
    private final double price;
    private final String name;

    private final ProductDiscountType productDiscountType;

    public Product(double price, String name, ProductDiscountType productDiscountType) {
        this.price = price;
        this.name = name;
        this.productDiscountType = productDiscountType;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getDiscountedPrice() {
        return this.productDiscountType.getPriceRate() * this.getPrice();
    }

    public int getEarnedLoyaltyPoints() {
        return (int) (this.productDiscountType.getLoyaltyPointsRate() * this.getPrice());
    }

}
