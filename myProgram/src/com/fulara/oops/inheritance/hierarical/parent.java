/* This inheritance is called hierarical inheritance. In this inheritace Parent class is parent and its child class is child1 and child2. So child1 can access the object of
* parent class but can't access the object of child2. And this also done by child class child2 */

package com.fulara.oops.inheritance.hierarical;

public class parent {
    void income(){
        System.out.println("Me hi krta dhrata hu");
    }
}
class child1 extends parent{
    void tenRupee(){
        System.out.println("10 rupee chahiye toffee ke liye");
    }
}
class child2 extends parent{
    void hundredRupee(){
        System.out.println("100 rupee chahiye copy leni hai");
    }

    public static void main(String[] args) {

        parent p = new parent();
        child1 c1 = new child1();
        child2 c2 = new child2();

        p.income();
        System.out.println("--------------------------------------------");

        c1.income();
        c1.tenRupee();
        System.out.println("--------------------------------------------");

        c2.income();
        c2.hundredRupee();

    }

}
