package com.shx;

public class Main {

    public static void main(String[] args) {
//        int maxValue = Integer.MAX_VALUE; // 最大值
//        int minValue = Integer.MIN_VALUE; // 最小值
//        long result = (long)maxValue + 1;
//        System.out.println("Hello World!");
//        System.out.println(maxValue);
//        System.out.println(minValue);
//        System.out.println(maxValue + 1); // 数据溢出
//        System.out.println(minValue - 1); // 数据溢出
//        System.out.println(result); // 不溢出

        ArrayDemo demo = new ArrayDemo();
        demo.sort();
//        demo.inc();
        demo.printArray();
        System.out.println(demo.findMax());
    }

}
