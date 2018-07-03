package com.shx;

// 创建对象实例的时候直接初始化，空间换时间
public class SingletonOne {
    // 1.创建私有构造类
    private SingletonOne() {
    }

    // 2.创建该类型的私有静态实例
    private static SingletonOne instance = new SingletonOne();

    // 3.创建公有静态方法返回静态实例对象
    public static SingletonOne getInsrance() {
        return instance;
    }
}
