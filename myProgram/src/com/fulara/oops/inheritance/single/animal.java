package com.fulara.oops.inheritance.single;

public class animal {

    void eat() {
        System.out.println("I am eating ");
    }
}

    class Dog extends animal {
        public static void main(String[] args) {
            Dog d1 = new Dog();
            d1.eat();
        }
    }
