package com.fulara.oops.defaultConstructor;

public class car {

    String name;
    String model;
    int yom;
    int no;

        car(String name, String model, int yom, int no) {
            this.name = name;
            this.model = model;
            this.yom = yom;
            this.no = no;
        }

    void name(){
        System.out.println("Car name is : "+name);
    }
    void model(){

        System.out.println("Model name is :"+model);
    }
    void yom(){
        System.out.println("Manufactured year is " +yom);
    }
    void no(){
        System.out.println(" Number is " +no);
    }
    void all(){
        System.out.println(name + " is car and it is " + model + " model. And it is " +yom+ " model.Car no  is "+no);
    }

    public static void main(String[] args) {

        car c1 = new car("TATA", "punch", 2024,8779);


        car c2 = new car("Mahindra","Thar",2020,3452);
//
//        c1.name = "Tata";
//        c1.model = "Punch";
//        c1.yom = 2024;
//        c1.no = 8779;

        c1.name();
        c1.model();
        c1.yom();
        c1.no();
        c1.all();
        System.out.println("-------------------------------------------------------------------------------");
        c2.all();
    }
}
