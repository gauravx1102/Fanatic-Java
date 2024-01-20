
/* Printing exception using e.printStackTrace
   This method will show exception name, description, StackTrace(line at which exception occuring)
    */

package com.fulara.exceptionHandling.methodsToPrintExcep;

public class m1 {
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
            e.printStackTrace();          /* java.lang.ArithmeticException: (Exception name)
                                           / by zero                     (Description why exception occuring)
                                           at com.fulara.exceptionHandling.methodsToPrintExcep.m1.main(m1.java:16) (StackTrace or line at where exception occuring)*/
        }
        System.out.println("Excecuted");
    }
}
