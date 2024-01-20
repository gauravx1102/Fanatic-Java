package com.fulara.exceptionHandling.tryCatch;

import java.io.FileInputStream;

public class tryAndCatch {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/home/whoami/Desktop java");//Exception found in compile time
        }
        catch (Exception e){
            System.out.println(e); //so this method will be execute
        }
    }
}
