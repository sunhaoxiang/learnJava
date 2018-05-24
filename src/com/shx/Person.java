package com.shx;

public abstract class Person {

  private String name;
  private int age;

  public Person(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
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

}
