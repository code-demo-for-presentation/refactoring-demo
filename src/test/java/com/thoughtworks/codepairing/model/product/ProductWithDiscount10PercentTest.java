package com.thoughtworks.codepairing.model.product;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductWithDiscount10PercentTest {
    @Test
    public void should_calculate_discounted_price() {
        ProductWithDiscount10Percent product = new ProductWithDiscount10Percent(100, "milk");
        assertEquals(90, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void should_calculate_loyalty_points() {
        ProductWithDiscount10Percent product = new ProductWithDiscount10Percent(100, "milk");
        assertEquals(10, product.getEarnedLoyaltyPoints());
    }
}