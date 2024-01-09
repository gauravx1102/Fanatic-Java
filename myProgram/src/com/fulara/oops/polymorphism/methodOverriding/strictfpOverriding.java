package com.fulara.oops.polymorphism.methodOverriding;

public class strictfpOverriding {

    strictfp void main(){
        System.out.println("1");
    }
}
class ccc{
    void main(){
        System.out.println("2");
    }

    public static void main(String[] args) {

        strictfpOverriding s = new strictfpOverriding();
        ccc c = new ccc();

        s.main();
        c.main();
    }
}
