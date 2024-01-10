package com.fulara.oops.polymorphism.methodOverriding;

public class aeroplane {
    void engine(){
        System.out.println("Engine hot hai");
    }
}
class aero extends aeroplane{
    void engine(){
        super.engine();
        System.out.println("ud raha hai");
    }

    public static void main(String[] args) {

        aeroplane a = new aeroplane();
        aero a1 = new aero();

        a.engine();
        a1.engine();
    }
}
