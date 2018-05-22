package com.shx;

class Student extends Person {

  private int score;

  Student(String name){
    super(name);
  }

  private int getScore() {
    return this.score;
  }

  void setScore(int score) {
    this.score = score;
  }

  void printScore() {
    System.out.println(this.getName() + "'s score is " + this.getScore());
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
