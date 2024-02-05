package com.fulara.aasu;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        in.nextLine();
        System.out.println("Enter the name : ");
        String name = in.nextLine();
        System.out.println("Enter your contact number : ");
        String con = in.nextLine();
        System.out.println("Hello "+name+". How are you? Is this your contact number = "+con);
    }
}
