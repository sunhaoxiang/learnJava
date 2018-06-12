package com.shx;

class Student extends Person {

    private int score;

    Student(String name) {
        super(name);
    }

    void setScore(int score) {
        this.score = score;
    }

    void printScore() {
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
