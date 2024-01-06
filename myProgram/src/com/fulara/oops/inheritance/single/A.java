
/* Me isme a class se b ke object ko call nhii kr skta hu  jaise a.showB() ko call krne pr merko error milegi */

package com.fulara.oops.inheritance.single;
public class A {
    void showA(){
        System.out.println("A is class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B is class method");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.showA();

        b.showA();
        b.showB();
    }
}
