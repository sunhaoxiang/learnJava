package com.shx;

class Student extends Person {

  private int score;

  public Student(String name){
    super(name);
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void printScore() {
    System.out.println(this.getName() + "'s score is " + score);
  }

  @Override
  public void run() {
    System.out.println("Student " + this.getName() + " is running!");
  }

  @Override
  public String hello() {
    return super.hello() + '!';
  }

}
