package com.fulara.exceptionHandling.tryCatch;

import java.util.Scanner;

public class tc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int classs= 12;
        int roll = 12;
        int n = 0;
        if (classs == roll){
            System.out.println("Equal");
        }
        try {
            System.out.println(classs/n);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
