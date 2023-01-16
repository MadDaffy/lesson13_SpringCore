package com.geekbrains.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private Cart cart;

    public void createOrder() {

        cart.getCartList().stream().map(Product::getTitle).forEach(System.out::println);
        double sum = cart.getCartList().stream().mapToDouble(Product::getCoast).sum();
        System.out.println(sum);
    }

}
