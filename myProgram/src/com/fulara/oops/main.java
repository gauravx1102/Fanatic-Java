package com.fulara.oops;

public class main {
    public static void main(String[] args) {

        bike myBike = new bike();

        System.out.println(myBike.make);
        System.out.println(myBike.model);

        myBike.drive();
        myBike.brake();

    }

}
