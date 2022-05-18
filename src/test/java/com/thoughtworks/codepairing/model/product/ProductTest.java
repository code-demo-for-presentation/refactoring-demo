package com.thoughtworks.codepairing.model.product;

import org.junit.Test;

import static com.thoughtworks.codepairing.model.product.ProductDiscountType.*;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void shouldCalculateDiscountedPriceWithNoDiscount() {
        Product product = new Product(100, "milk", NO);
        assertEquals(100, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculateDiscountedPriceWith10PercentDiscount() {
        Product product = new Product(100, "milk", TEN);
        assertEquals(90, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculateDiscountedPriceWith15PercentDiscount() {
        Product product = new Product(100, "milk", FIFTEEN);
        assertEquals(85, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculateDiscountedPriceWith20PercentDiscount() {
        Product product = new Product(100, "milk", TWENTY);
        assertEquals(80, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculateLoyaltyPointsWithNoDiscount() {
        Product product = new Product(100, "milk", NO);
        assertEquals(20, product.getEarnedLoyaltyPoints());
    }

    @Test
    public void shouldCalculateLoyaltyPointsWith10PercentDiscount() {
        Product product = new Product(100, "milk", TEN);
        assertEquals(10, product.getEarnedLoyaltyPoints());
    }

    @Test
    public void shouldCalculateLoyaltyPointsWith15PercentDiscount() {
        Product product = new Product(100, "milk", FIFTEEN);
        assertEquals(6, product.getEarnedLoyaltyPoints());
    }

    @Test
    public void shouldCalculateLoyaltyPointsWith20PercentDiscount() {
        Product product = new Product(100, "milk", TWENTY);
        assertEquals(5, product.getEarnedLoyaltyPoints());
    }


}