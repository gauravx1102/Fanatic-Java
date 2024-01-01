/*Enter 3 numbers from the user & make a function to print their average*/


package com.fulara.ytexer;

import java.util.Scanner;

public class ques1 {

    public static int average(int a, int b, int c){
        int avg =  (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int avg = average(a,b,c);
        System.out.println("The average of "+a+ ", "+b+", "+c+ " is " +avg);


    }
}
