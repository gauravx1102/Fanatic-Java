package com.fulara.oops.polymorphism.methodOverriding;

import com.sun.source.tree.SynchronizedTree;

public class synchoronizedOverriding {
    synchronized void main(){
        System.out.println("Gaurav");
    }
}
class newC extends synchoronizedOverriding{
    void main(){
        System.out.println("Fulara");
    }

    public static void main(String[] args) {
        synchoronizedOverriding s = new synchoronizedOverriding();
        newC n = new newC();

        s.main();
        n.main();
    }
}
