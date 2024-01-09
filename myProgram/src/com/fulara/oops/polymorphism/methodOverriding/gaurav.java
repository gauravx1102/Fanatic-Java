/* Object is parent class of all the classes in java */

package com.fulara.oops.polymorphism.methodOverriding;

public class gaurav {
     Number main(){
        System.out.println("1");
        return null;
    }
}

class fulara {
    int main(){
        System.out.println("2");
        return 0;
    }

    public static void main(String[] args) {
        gaurav c1 = new gaurav();
        fulara c2 = new fulara();

        c1.main();
        c2.main();
    }
}
