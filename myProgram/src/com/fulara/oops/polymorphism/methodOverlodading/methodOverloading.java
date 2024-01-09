package com.fulara.oops.polymorphism.methodOverlodading;

public class methodOverloading {

    void show(){       //0 arguments
        System.out.println("1");
    }
    void show(int a){      // 1 argumets
        System.out.println("2");
    }

    public static void main(String[] args) {

        methodOverloading m = new methodOverloading();
        m.show(100);
    }
}
