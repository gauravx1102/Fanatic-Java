
/* Default Constructor */

package com.fulara.oops.constructor.defaultConstructor;

public class bike {

    String name;
    String model;
    int manu;


    public void display(){
        System.out.println("The "+model+" is manufactured in "+manu+" is a model of " +name);
    }


    public static void main(String[] args) {

        bike b1 = new bike();
        bike b2 = new bike();
        bike b3 = new bike();

        b1.name = "Bajaj";
        b1.model = "Pulsar";
        b1.manu = 2020;



        b2.name = "Hero";
        b2.model = "Spelndor";
        b2.manu = 2024;


        b3.name = "Honda";
        b3.model = "Shine";
        b3.manu = 2023;


        b1.display();
        System.out.println("-------------------------------------------------------------------");
        b2.display();
        System.out.println("-------------------------------------------------------------------");
        b3.display();

    }
}
