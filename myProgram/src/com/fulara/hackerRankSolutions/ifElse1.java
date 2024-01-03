/*Given an integer,

, perform the following conditional actions:

    If

n is odd, print Weird

If n is even and in the inclusive range of 2 to 5, print Not Weird

If n is even and in the inclusive range of 6 to 20, print Weird

If n is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not is weird.

Input Format

A single line containing a positive integer,n. */

package com.fulara.hackerRankSolutions;

import java.util.*;
public class ifElse1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = in.nextInt();

        if(n % 2 != 0){
            System.out.print("Weird");
        }
        else if (n % 2 == 0){
            if (n>=2 && n <=5){
                System.out.println("Not Weird");
            } else if (n>=6 && n<=20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
