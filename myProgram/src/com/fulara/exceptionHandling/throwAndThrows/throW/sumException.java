package com.fulara.exceptionHandling.throwAndThrows.throW;

import java.util.Scanner;

public class sumException extends RuntimeException{
    sumException(String msg){

        super(msg);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first and second number : ");
        int a = in.nextInt();
        int b = in.nextInt();

        int result = a + b;
        System.out.println("The sum is "+result);

        try {
            if (result < 20){
                throw new sumException("The sum is lower than expected");
            }
            else {
                System.out.println("The sum is as Expected");
            }
        }
        catch (sumException s){
            s.printStackTrace();
        }
    }
}
