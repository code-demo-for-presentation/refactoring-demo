package com.thoughtworks.codepairing.model.product;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductWithDiscount15PercentTest {

    @Test
    public void should_calculate_discounted_price() {
        ProductWithDiscount15Percent product = new ProductWithDiscount15Percent(100, "10121123", "milk");
        assertEquals(85, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void should_calculate_loyalty_points() {
        ProductWithDiscount15Percent product = new ProductWithDiscount15Percent(100, "10121123", "milk");
        assertEquals(6, product.getEarnedLoyaltyPoints());
    }
}