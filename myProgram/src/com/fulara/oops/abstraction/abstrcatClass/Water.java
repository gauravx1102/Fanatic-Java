package com.fulara.oops.abstraction.abstrcatClass;

abstract public class Water {
     abstract void work();
}
class liquid extends Water{
    void work(){
        System.out.println("Liquid form of water");
    }
}
class gas extends Water{
    void work(){
        System.out.println("Gas is the form of water");
    }
}

class solid extends Water{
    void work(){
        System.out.println("Solid form of water");
    }

    public static void main(String[] args) {
        solid s = new solid();
        liquid l = new liquid();
        gas g = new gas();
        s.work();
        l.work();
        g.work();
    }
}
