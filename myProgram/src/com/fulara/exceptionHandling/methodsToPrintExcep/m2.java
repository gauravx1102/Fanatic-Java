/*
      This type of exception handling show exception name, description but didn't show the line(StackTrace)
*/


package com.fulara.exceptionHandling.methodsToPrintExcep;

public class m2 {
    public static void main(String[] args) {

        try {
            int a,b,c;
            a = 10;
            b = 2;
            c = 0;
            System.out.println(a/b);
            System.out.println(a/c);
        }
        catch (Exception e){
            System.out.println(e);                // java.lang.ArithmeticException: / by zero  ( Exception name )
            System.out.println(e.toString());     // java.lang.ArithmeticException: / by zero   (Description)
        }

    }
}
