package com.shx;

class Student extends Person {

  private int score;

  private int getScore() {
    return this.score;
  }

  void setScore(int score) {
    this.score = score;
  }

  void printScore() {
    System.out.println(this.getName() + "'s score is " + this.getScore());
  }
}
