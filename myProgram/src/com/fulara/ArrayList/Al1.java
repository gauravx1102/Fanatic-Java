package com.fulara.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Al1{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(234);
//        list.add(23);
//        list.add(2334);
//        list.add(2454);
//        list.add(864);
//
//

        // Input using for loop
        for (int i = 0; i<5;i++){
            System.out.print("Enter the input : ");
            list.add(in.nextInt());
        }
         //output
        System.out.println(list);

    }
}