package com.shx;

public class Student {
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;

    public Student() {
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String introduction() {
        String str = "学生信息如下： \n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" + this.getStudentSex() + "\n年龄：" + this.getStudentAge();
        return str;
    }
}
