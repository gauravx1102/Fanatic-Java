/*
If there is no exception at try method so catch method will never be executed
or if there is an exception in try method so catch method will execute

NOTE - Catch method is used for handling the exception not for removing the exception.

 */

package com.fulara.exceptionHandling.tryCatch;

public class tc1 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 5;
            System.out.println("1");
            System.out.println(a / b);
            System.out.println("3");           //There is no exception at try method so catch method will not execute
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("4");
        }
        System.out.println("5");


/*        try {
            int a = 10;
            int b = 0;
            System.out.println("1");
            System.out.println(a / b);
            System.out.println("2");     //There is an exception at try method so catch method will execute after that line where try method gave an exception and after
                                         //exception no line will be excecute in try method. Program will be directly reffered to catch method
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("3");
        }
        System.out.println("4");*/
    }
}
