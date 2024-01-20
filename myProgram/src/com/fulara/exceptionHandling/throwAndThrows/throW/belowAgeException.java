package com.fulara.exceptionHandling.throwAndThrows.throW;

import java.util.Scanner;

public class belowAgeException extends RuntimeException
{
    belowAgeException(String mes){
        super(mes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = in.nextInt();
        try {
            if (age < 18) {
                throw new belowAgeException("Not eligible");
            }
            else {
                System.out.println("Vote registered successfully ! Aaiega to modi hi");
            }
        }
        catch (belowAgeException e){
            e.printStackTrace();
        }
        System.out.println("Vote dena jarur agar 18+ ho to");
    }
}
