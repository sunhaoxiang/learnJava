package com.shx;

public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    public Subject() {
    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        if (subjectLife <= 0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    /**
     *
     * @return 专业相关信息
     */
    public String info() {
        String str = "专业信息如下： \n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectNo() + "\n学制年限：" + this.getSubjectLife() + "年";

        return str;
    }

}
