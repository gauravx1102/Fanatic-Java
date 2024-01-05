package com.fulara.oops.constructorOverloading;

public class student {
    String name;
    int classs;
    int roll;

    String behaviour;

    student(String name, int classs , int roll, String behaviour){
        this.name = name;
        this.classs = classs;
        this.roll = roll;
        this.behaviour = behaviour;
    }

    public void name(){
        System.out.println("My name is "+name);
    }
    public void classs(){
        System.out.println("I study in class "+classs);
    }

    public void roll(){
        System.out.println("My roll number is "+roll);
    }

    public void behaviour(){
        System.out.println(name+ " behaviour is " +behaviour);
    }


    public static void main(String[] args) {

        student s1 = new student("Gaurav", 12,11,"Very Good");
        student s2 = new student("Aayush", 10,1,"Good");



//        s1.name = "Gaurav";
//        s1.classs = 12;
//        s1.roll = 11;
//        s1.behaviour = "Very Good";

        s1.name();
        s1.classs();
        s1.roll();
        s1.behaviour();

        System.out.println("--------------------------------------------------------------");

        s2.name();
        s2.classs();
        s2.roll();
        s2.behaviour();
    }
}
