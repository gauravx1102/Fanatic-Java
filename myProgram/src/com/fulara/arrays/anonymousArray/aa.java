package com.fulara.arrays.anonymousArray;

public class aa {

    public static void sum(int[]a){
        int total = 0;
        for(int i : a)
//        for(int i = 0;i<a.length;i++)
        {
            total = total + i;
        }
        System.out.println("The sum is : "+total);
    }

    public static void main(String[] args) {
        sum(new int[]{10,20,30,40,50});


    }
}
