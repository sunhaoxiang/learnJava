package com.shx;

public class Main {

    enum Size { SMALL, MEDIUM, LARGE};

    public static void main(String[] args) {
//        Student s = new Student("Xiao Hong");
//        s.setName("Xiao Hong");
//        s.setScore(98);
//        s.run();
//        s.printScore();
//        System.out.println(s.hello());
//        Person.getNumber(3);
//        Size small =Size.SMALL;
//        System.out.println(small);
//        String greeting = "Hello";
//        String str = greeting.substring(0, 3);
//        System.out.println(str);
//        String all = String.join(" / ", "S", "M", "L", "XL");
//        System.out.println(all);
        String greeting = "Hello ";
        String somebody = "World";
        StringBuilder builder = new StringBuilder();
        builder.append(greeting);
        builder.append(somebody);
        String completedString = builder.toString();
        System.out.println(completedString);

    }

}
