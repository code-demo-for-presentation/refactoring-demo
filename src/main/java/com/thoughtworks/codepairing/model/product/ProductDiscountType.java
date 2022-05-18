package com.thoughtworks.codepairing.model.product;

public enum ProductDiscountType {
    NO(1, 0.2),
    TEN(0.9, 0.1),
    FIFTEEN(0.85, 0.06),
    TWENTY(0.8, 0.05);

    private final double priceRate;
    private final double loyaltyPointsRate;

    ProductDiscountType(double priceRate, double loyaltyPointsRate) {
        this.priceRate = priceRate;
        this.loyaltyPointsRate = loyaltyPointsRate;
    }

    public double getPriceRate() {
        return priceRate;
    }

    public double getLoyaltyPointsRate() {
        return loyaltyPointsRate;
    }

}
