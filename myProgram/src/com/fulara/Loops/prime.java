package com.fulara.Loops;

import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i=0; i<t;i++){
            int n = in.nextInt();
            int count = 0;
            for (int x = 1; x<=n;x++) {
                if (n % x == 0) {
                    count++;
                }
            }
                if(count==2){
                    System.out.println("prime");
                }
                else {
                    System.out.println("Not Prime");
                }
            }
        }
    }
