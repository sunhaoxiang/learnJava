package com.shx;

/**
 * cat类
 */
public class Cat extends Animal {
    private double weight;

    public Cat() {
    }

    public Cat(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName() + "是一只" + this.getSpecies() + ",它在奔跑");
    }
}
