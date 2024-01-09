/* We can call parent class method in overriding method using super keyword */

package com.fulara.oops.polymorphism.methodOverriding;

public class newCase {
    void show(){
        System.out.println("Gaurav");
    }
}
class newCase1 extends newCase {
    void show(){
        super.show();
        System.out.println("Fulara");
    }

    public static void main(String[] args) {
        newCase n1 = new newCase1();
        newCase1 n2 = new newCase1();

        n1.show();
//        n2.show();
    }
}
