package com.fulara.arrays.oneDArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}