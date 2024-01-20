/*
      This type of exception handling only show description but didn't show the  exception name and line(StackTrace)
*/

package com.fulara.exceptionHandling.methodsToPrintExcep;

public class m3 {
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
            System.out.println(e.getMessage());   //   / by zero  (Only description)
        }
    }
}
