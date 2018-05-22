package com.shx;

public class Person {

  private String name;
  private int age;

  Person(String name){
    this.name = name;
  }

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

  String hello() {
    return "Hello, " + this.name;
  }

  void run() {
    System.out.println("Student " + this.name + " is running!");
  }

}
