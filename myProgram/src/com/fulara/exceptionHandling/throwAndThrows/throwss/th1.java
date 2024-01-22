
/* USING TRY CATCH IN MAIN METHOD */

package com.fulara.exceptionHandling.throwAndThrows.throwss;

public class th1 {
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        th1 t = new th1();
        try {
            System.out.println(divide(25, 0));
        }
        catch (Exception e){
            System.out.println("handeled");
        }
    }
}