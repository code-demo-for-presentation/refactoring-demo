package com.thoughtworks.codepairing;

import com.thoughtworks.codepairing.model.Customer;
import com.thoughtworks.codepairing.model.product.Product;
import com.thoughtworks.codepairing.model.ShoppingCart;
import com.thoughtworks.codepairing.model.Order;
import com.thoughtworks.codepairing.model.product.ProductWithDiscount10Percent;

import java.util.ArrayList;
import java.util.List;

public class SampleApp {
    public static void main(String[] args) {
        Product product1 = new ProductWithDiscount10Percent(10.0, "PRODUCT1", "product 1");
        Product product2 = new ProductWithDiscount10Percent(20.0, "PRODUCT2", "product 2");

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Customer customer = new Customer("A Customer");

        ShoppingCart shoppingCart = new ShoppingCart(customer, products);
        Product product3 = new ProductWithDiscount10Percent(30.0, "PRODUCT3", "product 3");
        shoppingCart.addProduct(product3);
        System.out.println(shoppingCart);

        Order order = shoppingCart.checkout();
        System.out.println(order.toString());
    }
}
