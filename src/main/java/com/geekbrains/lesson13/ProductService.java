package com.geekbrains.lesson13;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    private List<Product> productList;

    public void printAll() {
        productList.stream().map(Product::getTitle).forEach(System.out::println);
    }

    Product findByTittle(String tittle) {
        return productList.stream().filter(product -> product.getTitle().equals(tittle)).findFirst().get();
    }

    @PostConstruct
    public void initProductList() {
        productList = new ArrayList<>(10);
        productList.add(new Product(1L, "milk", 99));
        productList.add(new Product(2L, "beer", 149));
        productList.add(new Product(3L, "cheese", 319));
        productList.add(new Product(4L, "chocolate", 129));
        productList.add(new Product(5L, "eggs", 119));
        productList.add(new Product(6L, "fish", 299));
        productList.add(new Product(7L, "meat", 349));
        productList.add(new Product(8L, "bread", 69));
        productList.add(new Product(9L, "coffee", 399));
        productList.add(new Product(10L, "tea", 379));
    }
}
