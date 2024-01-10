package com.fulara.oops.abstraction.abstrcatClass;

abstract public class vechile {

    abstract void start();
}
class Car extends vechile{
    void start(){
        System.out.println("Car should start with kick");
    }
}
class Bike extends vechile{
    void start(){
        System.out.println("Bike should start with water ");
    }

    public static void main(String[] args) {
//        vechile v = new vechile();

        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}