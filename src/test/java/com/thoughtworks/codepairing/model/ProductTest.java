package com.thoughtworks.codepairing.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    public void shouldCalculatePriceWithNoDiscount() {
        Product product = new Product(100, "", "milk");
        assertEquals(100.0, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculatePriceWith10PercentDiscount() {
        Product product = new Product(100, "DIS_10_A", "milk");
        assertEquals(90.0, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculatePriceWith15PercentDiscount() {
        Product product = new Product(100, "DIS_15_A", "milk");
        assertEquals(85.0, product.getDiscountedPrice(), 0.0);
    }

    @Test
    public void shouldCalculatePriceWith20PercentDiscount() {
        Product product = new Product(100, "DIS_20_A", "milk");
        assertEquals(80.0, product.getDiscountedPrice(), 0.0);
    }
}