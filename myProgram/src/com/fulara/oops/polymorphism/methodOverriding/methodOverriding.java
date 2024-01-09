/* 1- Same name
   2- Same class
   3-Same arguments
        -No. of arguments
        -Type of arguments
        -Sequnces of arguments
   4-Inheritance
 */

package com.fulara.oops.polymorphism.methodOverriding;

import com.fulara.oops.polymorphism.methodOverlodading.test;

public class methodOverriding {

    void show(String a){
        System.out.println("1");
    }
}
class methodd extends test {

    void show(int a,String b){
        System.out.println("2");
    }

    public static void main(String[] args) {

        methodOverriding m = new methodOverriding();
        methodd m1 = new methodd();

        m.show("anc");
        m1.show(100,"avx");

    }
}
