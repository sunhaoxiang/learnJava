package com.shx;

public class Person {

  private String name;
  private int age;

  String getName() {
    return this.name;
  }

  void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  void run() {
    System.out.println(this.name + " is running!");
  }

}
