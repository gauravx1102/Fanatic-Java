package com.fulara.example;

public class example {

    String name;
    String model;
    int age;
    double no;

    example(String name, String model, int age, double no){    //this method used in parameterized constructor
        this.name = name;
        this.model = model;
        this.age = age;
        this.no = no;
    }

    void display(){
        System.out.println(name+" , "+model+" , "+age+" , "+no);
    }
     /* This is the example of default constructor

    public static void main(String[] args) {

            example e = new example();
            e.name = "gaurav";
            e.model = "Fulara";
            e.age = 21;
            e.no = 7;
            e.display();
    }*/
     public static void main(String[] args) {

         example e = new example("Gaurav", "Fulara", 50/2,242);
         e.display();
     }


}
