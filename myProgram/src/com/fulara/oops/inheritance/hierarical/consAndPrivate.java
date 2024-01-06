/* This program will gave an error beacuse constructor and private methods can't be inherted in other class*/

package com.fulara.oops.inheritance.hierarical;

public class consAndPrivate {

    String name;
    int age;
    Double roll;

    consAndPrivate(String name, int age, Double roll){
        this.age = age;
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println(name+ " age is "+age+ " whose roll is "+roll);
    }
}
class javaa extends consAndPrivate{

    void go(){
        System.out.println("I am going");
    }

    public static void main(String[] args) {

        javaa j = new javaa();
        consAndPrivate c1 = new consAndPrivate();

        j.display();

    }
}
