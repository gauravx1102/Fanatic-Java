/* Class sirf apne objects ya apne se pehli class ke objects ko hi call kr skta hai apni baad ki clss ke objects ko call
 nhi kr skta quki ye mutltilevel inheritance nhi hai or java me koi bhi inheritance ka essa concept nhi hai jisme pehli class apne baad
  ke class ke object ko call krti ho ya kr skti ho */

package com.fulara.oops.inheritance.multilevelInheritance;

public class vehicle {

    void brand(){
        System.out.println("This vehicle owns bt TATA");
    }
}
class car extends vehicle{
    void speed(){
        System.out.println("This cars is so furious");
    }
}

class tyre extends car{
    void quality(){
        System.out.println("Quality of this car is very good");
    }

    public static void main(String[] args) {
        vehicle v = new vehicle();
        car c = new car();
        tyre t = new tyre();

        v.brand();
        System.out.println("--------------------------------------------");

        c.brand();
        c.speed();

        System.out.println("--------------------------------------------");


        t.brand();
        t.brand();
        t.quality();

        System.out.println("--------------------------------------------");
//        System.out.println("");
        System.out.println("Ab aa gya thoda bahut Inheritance smjh me");


    }
}
