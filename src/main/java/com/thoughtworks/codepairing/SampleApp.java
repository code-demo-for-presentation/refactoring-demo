package com.thoughtworks.codepairing;

import com.thoughtworks.codepairing.model.Customer;
import com.thoughtworks.codepairing.model.product.Product;
import com.thoughtworks.codepairing.model.ShoppingCart;
import com.thoughtworks.codepairing.model.Order;
import com.thoughtworks.codepairing.model.product.ProductDiscountType;
import com.thoughtworks.codepairing.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class SampleApp {
    public static void main(String[] args) {
        Product product1 = new Product(10.0, "product 1", ProductDiscountType.TEN);
        Product product2 = new Product(20.0, "product 2", ProductDiscountType.TEN);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Customer customer = new Customer("A Customer");

        ShoppingCart shoppingCart = new ShoppingCart(customer, products);
        Product product3 = new Product(30.0, "product 3", ProductDiscountType.TEN);
        shoppingCart.addProduct(product3);
        System.out.println(shoppingCart);

        Order order = shoppingCart.checkout();
        System.out.println(order.toString());
    }
}
