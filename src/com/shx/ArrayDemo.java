package com.shx;

public class ArrayDemo {
    int[] data = {3, 1, 2, 5, 4};

    public int findMax() {
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] > data[maxIndex]) {
                maxIndex = i;
            }
        }

        return data[maxIndex];
    }

    public void printArray() {
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }

        for (int i: data) {
            System.out.println(i);
        }
    }

    public void inc() {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }

    public void sort(){
        java.util.Arrays.sort(data);
    }
}
