package com.fulara.exceptionHandling.myException;

import java.util.Scanner;

public class myException extends Exception {

    myException() {
        super("you are not eligible for higher study's");
    }
    myException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a < 18) {
            try {
                throw new myException();
            } catch (myException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Prepare for next exam");
        }
    }
}
