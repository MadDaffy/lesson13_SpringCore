package com.geekbrains.lesson13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        Cart cart = context.getBean("cart", Cart.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        cart.add(productService.findByTittle("beer"));
        cart.add(productService.findByTittle("fish"));
        orderService.createOrder();

    }
}