package com.fulara.exceptionHandling.throwAndThrows.throW;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class t2 extends RuntimeException {
    static void ageR(int a) {
        try {
            if (a < 18) {
                throw new FileNotFoundException("You are not eligible");
            }
            else {
                System.out.println("You're Eligible");
            }
        }
        catch (Exception ae){
            ae.printStackTrace();
//            System.out.println("we found exception at try method So I'm executing");
        }
    }

    public static void main(String[] args) {
        ageR(21);
    }
}