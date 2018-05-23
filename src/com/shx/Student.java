package com.shx;

class Student extends Person {

  private int score;

  Student(String name){
    super(name);
  }

  void setScore(int score) {
    this.score = score;
  }

  void printScore() {
    System.out.println(this.getName() + "'s score is " + this.score);
  }

  @Override
  void run() {
    System.out.println("Student " + this.getName() + " is running!");
  }

  @Override
  String hello() {
    return super.hello() + '!';
  }

}
