package com.shx;

public class Main {

    enum Size { SMALL, MEDIUM, LARGE};

    public static void main(String[] args) {
        Student s = new Student("Xiao Hong");
        s.setName("Xiao Hong");
        s.setScore(98);
        s.run();
        s.printScore();
        System.out.println(s.hello());
        Person.getNumber(3);
        Size small =Size.SMALL;
        System.out.println(small);
    }

}
