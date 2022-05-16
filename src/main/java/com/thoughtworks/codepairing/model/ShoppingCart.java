package com.thoughtworks.codepairing.model;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private final List<Product> products;
    private final Customer customer;

    public ShoppingCart(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Order checkout() {
        double totalPrice = calculateTotalPrice(products);
        int loyaltyPointsEarned = calculateLoyaltyPoints(products);
        return new Order(totalPrice, loyaltyPointsEarned);
    }

    private int calculateLoyaltyPoints(List<Product> products) {
        int totalLoyaltyPointsEarned = 0;
        for (Product product : products) {
            totalLoyaltyPointsEarned = product.getEarnedLoyaltyPoints();
        }
        return totalLoyaltyPointsEarned;
    }

    private double calculateTotalPrice(List<Product> products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getDiscountedPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Customer: " + customer.getName() + "\n" + "Bought:  \n" + products.stream().map(p -> "- " + p.getName() + ", " + p.getPrice()).collect(Collectors.joining("\n"));
    }
}
