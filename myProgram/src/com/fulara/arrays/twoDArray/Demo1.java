package com.fulara.arrays.twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        int array[][] = {{12,23,4,5,56},{345,234,435,23,3}, {123,54,234,1,6,544}};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] +" | ");
            }
            System.out.println();
        }

    }
}