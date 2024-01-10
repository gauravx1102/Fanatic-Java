package com.fulara.oops.polymorphism.methodOverlodading;

public class gaadi {
    void working() {
        System.out.println("Gaadi chal rahi hai");
    }
    void working(int a){
        System.out.println("Gaadi ud rahi hai");
    }

    public static void main(String[] args) {
        gaadi g = new gaadi();

        g.working(100);
    }
}