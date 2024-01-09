/* Access modifier of Child class always should be greater than access modifier of parent class it's vice versa will
always generate an error  */
package com.fulara.oops.polymorphism.methodOverriding;

public class ff {
     Object mainMethod(){
         System.out.println("Gaurav");
         return 0;
    }
}
class gg extends ff {
     String mainMethod(){
        System.out.println("Fulara");
        return null;
    }

    public static void main(String[] args) {
        ff f = new ff();
        gg g = new gg();

        f.mainMethod();
        g.mainMethod();
    }
}
