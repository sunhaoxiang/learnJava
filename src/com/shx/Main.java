package com.shx;

public class Main {

  public static void main(String[] args) {
    Student s = new Student("Xiao Hong");
    s.setName("Xiao Hong");
    s.setScore(98);
    s.run();
    s.printScore();
    System.out.println(s.hello());
  }

}
