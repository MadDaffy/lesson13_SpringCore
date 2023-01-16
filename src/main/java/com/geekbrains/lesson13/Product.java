package com.geekbrains.lesson13;

public class Product {

    private Long id;
    private String title;
    private double coast;

    public Product(Long id, String title, double coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }
}
