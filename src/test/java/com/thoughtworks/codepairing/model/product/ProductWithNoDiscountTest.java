package com.thoughtworks.codepairing.model.product;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductWithNoDiscountTest {

    @Test
    public void should_calculate_discounted_price() {
        ProductWithNoDiscount product = new ProductWithNoDiscount(100, "10121123", "milk");
        assertEquals(100, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void should_calculate_loyalty_points() {
        ProductWithNoDiscount product = new ProductWithNoDiscount(100, "10121123", "milk");
        assertEquals(20, product.getEarnedLoyaltyPoints());
    }

}