package com.fulara.aasu;

public class sum {
    int add(int a ,int b){
        int summ = a + b;
        System.out.println("Addition is: " +summ);
        return a+b;
    }
}
class subs extends sum{
    int subt(int a,int b){
        System.out.println("subtraction of "+a+" and " +b+" is "+(a-b));
        return a-b;
    }

    public static void main(String[] args) {
        sum s = new sum();
        subs s1 = new subs();

         s.add(10,20);
        s1.add(23,12);
        s1.subt(30,21);
    }
}
