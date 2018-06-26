package com.shx;

/**
 * cat类
 */
public class Cat {
    String name;
    int month;
    double weight;
    String species;

    public Cat() {}

    public Cat(String name, int month, double weight, String species) {
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
    }

    public void run() {
        System.out.println("Cat run.");
    }

    public void eat() {
        System.out.println("Cat eat.");
    }
}
