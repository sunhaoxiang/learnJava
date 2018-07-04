package com.shx;

public interface IPhoto {
    void photo();

    default void lookPhoto() {
        System.out.println("看照片");
    }
}
