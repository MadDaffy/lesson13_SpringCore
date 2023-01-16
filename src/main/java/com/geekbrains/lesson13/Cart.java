package com.geekbrains.lesson13;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    private List<Product> cartList;

    public void add(Product product) {
        cartList.add(product);
    }

    @PostConstruct
    public void initCart() {
        cartList = new ArrayList<>();
    }

    public List<Product> getCartList() {
        return cartList;
    }

    public void setCartList(List<Product> cartList) {
        this.cartList = cartList;
    }
}
