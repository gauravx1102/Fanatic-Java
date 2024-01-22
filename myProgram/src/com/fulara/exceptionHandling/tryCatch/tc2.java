package com.fulara.exceptionHandling.tryCatch;

import java.io.FileInputStream;
import java.util.Scanner;

public class tc2 {
    static void ageReflector(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int res = n1 + n2;
        if (res > 20){
            throw new ArithmeticException("You're output is greater than expected");
        }
        else {
            System.out.println("Good job");
        }
    }

    public static void main(String[] args) {
        afgeReflector();
    }
}