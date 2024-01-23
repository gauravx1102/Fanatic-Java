/* This program will occur a runtime Exception which is ArithmeticException */

package com.fulara.exceptionHandling.myException;

import java.util.Scanner;

public class my2Exception extends RuntimeException {

    my2Exception(){
        super("you're addition is not accurate");
    }
    my2Exception(String message){
        super(message);
    }

    public static void main(String[] args) throws my2Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int res = a + b;
        System.out.println(res);
        if (res < 23) {
            try{
                throw new my2Exception();
            }
            catch (my2Exception e){
                System.out.println("Gaurav");
            }
        }
    }
}
