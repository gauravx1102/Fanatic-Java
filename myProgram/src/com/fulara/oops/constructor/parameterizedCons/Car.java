
//parameterized constructor

package com.fulara.oops.constructor.parameterizedCons;

public class Car {
    String name;
    String model;
    int yom;
    String type;
    int speed;

    /*Creating a paramerterized constructor*/
        Car(String n, String m, int y, String t, int s){
        name = n;
        model = m;
        yom = y;
        type = t;
        speed = s;
    }

    public void display() {
        System.out.println(name + " is car and it is " + model + " model. Manufactured in " + yom + " . And it is " + type+ ". It's maximum speed is "+speed);
    }
    public void speed(){

    }

    public static void main(String[] args) {
        Car c1 = new Car("TATA","Harrier", 2024,"New", 120);
        Car c2 = new Car("Mahindra","Thar", 2014,"Old",100);


        /*c1.String name = "TATA";
        c1.String model = "Harrier";
//        c1.int yom = 2024;
        c1.String type = "Yes";
*/
        c1.display();
        c2.display();

    }

}