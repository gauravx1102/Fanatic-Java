package com.fulara.oops.polymorphism.methodOverriding;

public class test {
    protected void show(){
        System.out.println("1");
//        return null;
    }
}
class abc extends test{
    public void show(){
        System.out.println("2");
//        return null;
    }

    public static void main(String[] args) {
        test t = new test();
        abc a = new abc();

        t.show();
        a.show();
    }
}
