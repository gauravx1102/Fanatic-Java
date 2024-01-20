package com.fulara.exceptionHandling.tryCatch;

public class finally1 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c;
            c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Me to har haal me execute hunga Hi hi hi");   //If their any exception in try or catch block finally method will execute at any cost;
        }
    }
}
