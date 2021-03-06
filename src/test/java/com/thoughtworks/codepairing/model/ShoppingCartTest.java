package com.thoughtworks.codepairing.model;

import com.thoughtworks.codepairing.model.product.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static com.thoughtworks.codepairing.model.product.ProductDiscountType.*;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    public static final int PRICE = 100;
    public static final String PRODUCT = "Product";

    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("test");
    }

    @Test
    public void shouldCalculatePriceWithNoDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, NO));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(100.0, order.getTotalPrice(), 0.0);
    }

    @Test
    public void shouldCalculateLoyaltyPointsWithNoDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, NO));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(20, order.getLoyaltyPoints());
    }

    @Test
    public void shouldCalculatePriceFor10PercentDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, TEN));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(90.0, order.getTotalPrice(), 0.0);
    }

    @Test
    public void shouldCalculateLoyaltyPointsFor10PercentDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, TEN));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(10, order.getLoyaltyPoints());
    }

    @Test
    public void shouldCalculatePriceFor15PercentDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, FIFTEEN));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(85.0, order.getTotalPrice(), 0.0);
    }

    @Test
    public void shouldCalculateLoyaltyPointsFor15PercentDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, FIFTEEN));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(6, order.getLoyaltyPoints());
    }

    @Test
    public void shouldCalculatePriceFor20PercentDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, TWENTY));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(80.0, order.getTotalPrice(), 0.0);
    }

    @Test
    public void shouldCalculateLoyaltyPointsFor20PercentDiscount() {
        List<Product> products = Collections.singletonList(new Product(PRICE, PRODUCT, TWENTY));
        ShoppingCart cart = new ShoppingCart(customer, products);
        Order order = cart.checkout();

        assertEquals(5, order.getLoyaltyPoints());
    }
}
