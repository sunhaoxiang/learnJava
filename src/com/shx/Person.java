package com.shx;

public abstract class Person {

  private String name;
  private int age;
  public static int num;

  public Person(String name){
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

  public String hello() {
    return "Hello, " + name;
  }

  public abstract void run();

  static void getNumber(int a) {
    num = a;
    System.out.println("Number is " + num);
  }

}
