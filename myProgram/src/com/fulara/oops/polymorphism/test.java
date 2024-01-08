package com.fulara.oops.polymorphism;

public class test {

    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        test t = new test();
        t.show(29);
    }
}
