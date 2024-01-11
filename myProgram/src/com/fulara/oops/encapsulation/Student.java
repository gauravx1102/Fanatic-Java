package com.fulara.oops.encapsulation;

public class Student {
    private String name;
    private int classs;
    private double roll;

    public String getName() {
        return name;
    }

    public int getClasss() {
        return classs;
    }

    public double getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }
//}
//public class mains {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Gaurav");
        s.setClasss(12);
        s.setRoll(1234543);
        System.out.println(s.getName());
        System.out.println(s.getRoll());
        System.out.println(s.getClasss());
    }
}
