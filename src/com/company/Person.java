package com.company;

public class Person {

  private String name;
  private int age;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void run() {
    System.out.println(this.name + "is running!");
  }

}
