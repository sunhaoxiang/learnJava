package com.shx;

public class Person {

  private String name;
  private int age;

  Person(String name){
    this.name = name;
  }

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String hello() {
    return "Hello, " + name;
  }

  void run() {
    System.out.println("Student " + name + " is running!");
  }

}
