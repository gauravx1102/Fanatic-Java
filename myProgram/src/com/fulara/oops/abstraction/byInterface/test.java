package com.fulara.oops.abstraction.byInterface;

interface I1{
    void show();
}
interface I2{
    void display();
}
class test implements I1,I2 {
    public void show() {
        System.out.println("I am going");
    }

    public void display() {
        System.out.println("I am coming");
    }

    public static void main(String[] args) {
        test t = new test();
        t.display();
        t.show();
    }
}
