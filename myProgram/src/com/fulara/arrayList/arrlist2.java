package com.fulara.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class arrlist2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        //For addition of arraylist

        /* arr.add("Gaurav");
        System.out.println("Intitial arraylist "+arr);
        arr.add(1,"Fulara");
        arr.add(2,"Aayush");
        System.out.println("Final arraylist "+arr);*/

        //for changing the array

        /*arr.add("Fulara");
        arr.add("Aayush");
        System.out.println("Initial arraylist "+arr);

        arr.set(1,"Gaurav");
        System.out.println("Final arraylist "+arr);*/

        // Removing elements

      /*  arr.add("Gaurav");
        arr.add("Fulara");
        System.out.println("Initial arraylist : "+arr);
        arr.remove(1);
        System.out.println("Final arraylist : "+arr);
*/

        // Iterating the ArrayList

        arr.add("1");
        arr.add("2");
        arr.add(2,"3");
        arr.add(3,"2");

        //using for loop

        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
        System.out.println("--------------------------");

        //using for each

        for (String i : arr){
            System.out.println(i+" ");
        }

    }
}
