package com.company;

public class Flower {
    private String name;
    private double price;
    private int count;

    public Flower(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getNameFlowers() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

}
