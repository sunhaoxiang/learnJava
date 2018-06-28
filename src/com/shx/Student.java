package com.shx;

public class Student {
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;

    public Student() {
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge ,Subject studentSubject) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
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
        if (studentAge < 10 || studentAge > 100) {
            this.studentAge = 18;
        } else {
            this.studentAge = studentAge;
        }
    }

    public Subject getStudentSubject() {
        if (this.studentSubject == null) {
            this.studentSubject = new Subject();
        }
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }

    public String introduction() {
        String str = "学生信息如下： \n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别：" + this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称：" + this.getStudentSubject().getSubjectName() + "\n学制年限：" + this.getStudentSubject().getSubjectLife();
        return str;
    }
}
