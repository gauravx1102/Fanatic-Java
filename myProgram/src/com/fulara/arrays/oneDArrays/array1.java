package com.fulara.arrays.oneDArrays;

import java.util.Arrays;

public class array1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] =12;
        a[1] =23;
        a[2] =34;
        a[3] =4;
        a[4] =45;

        // By for loop using numbr
        for (int i = 0;i<5; i++) {

            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        //By for loop using length
        for (int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");

        //By for each loop
        for (int i : a){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        //By toString method
        System.out.println(Arrays.toString(a));



    }
}
