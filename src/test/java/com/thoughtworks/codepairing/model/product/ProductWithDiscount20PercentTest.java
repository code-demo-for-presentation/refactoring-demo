package com.thoughtworks.codepairing.model.product;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductWithDiscount20PercentTest {
    @Test
    public void should_calculate_discounted_price() {
        ProductWithDiscount20Percent product = new ProductWithDiscount20Percent(100, "milk");
        assertEquals(80, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void should_calculate_loyalty_points() {
        ProductWithDiscount20Percent product = new ProductWithDiscount20Percent(100, "milk");
        assertEquals(5, product.getEarnedLoyaltyPoints());
    }
}