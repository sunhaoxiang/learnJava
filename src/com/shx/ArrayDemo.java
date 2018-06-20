package com.shx;

public class ArrayDemo {
    int data[] = new int[] {1, 2, 3, 4, 5};

    public void printArray() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public void inc() {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }
}
