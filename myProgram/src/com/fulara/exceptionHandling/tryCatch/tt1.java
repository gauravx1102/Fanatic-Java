package com.fulara.exceptionHandling.tryCatch;

public class tt1 {
    public static void main(String[] args) {
        tt1 t = new tt1();
        t.divide();
    }
    void divide(){
        try {
            int a = 20;
            int b = 0;
            int c;

        c = a/b;
        System.out.println(c);
     }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Sorry");
        }
    }
}
