package com.fulara.arrays;

public class array1 {

    public static void main(String[] args) {

        int[] intArray = new int[5];

        intArray[0] =12;
        intArray[1] =23;
        intArray[2] =34;
        intArray[3] =4;
        intArray[4] =45;

//        for (int i = 0;i<5; i++) {
//
//            System.out.println(intArray[i]);
//        }

        for (int i = 0;i< intArray.length;i++){
            System.out.println(intArray[i]);
        }



    }
}
