package com.shx;

public class Emp {
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;

    public Emp() {}
    public Emp(int eno, String ena, String j, Double s, Double c) {
        setEmpno(eno);
        setEname(ena);
        setJob(j);
        setSal(s);
        setComm(c);
    }

    public void setEmpno(int eno) {
        empno = eno;
    }
    public void setEname(String ena) {
        ename = ena;
    }
    public void setJob(String j) {
        job = j;
    }
    public void setSal(Double s) {
        sal = s;
    }
    public void setComm(Double c) {
        comm = c;
    }
    public int getEmpno() {
        return empno;
    }
    public String getEname() {
        return ename;
    }
    public String getJob() {
        return job;
    }
    public double getSal() {
        return sal;
    }
    public double getComm() {
        return comm;
    }
    public String getInfo() {
        return "empno = " + empno + "\n" +
               "ename = " + ename + "\n" +
               "job = " + job + "\n" +
               "sal = " + sal + "\n" +
               "comm = " + comm;
    }
}
