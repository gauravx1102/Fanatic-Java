package com.fulara.ytexer;

import java.util.Scanner;

public class sumOfOddNo {

        public static int summation(int x, int y) {
            if (x % 2 != 0) {
                int oddSum = 0;  // Initialize oddSum outside the loop
                for (int i = x; i <= y; i += 2) {  // Increment by 2 to get odd numbers
                    oddSum += i;
                }
                return oddSum;
            } else {
                System.out.println("Invalid input");
                return -1;  // Returning -1 to indicate an invalid input
            }
        }

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = in.nextInt();
            int b = in.nextInt();

            int sum = summation(a, b);
            if (sum != -1) {
                System.out.println("Sum of odd numbers between "+a+ " and " +b+ ": "+ sum);
            }
        }

}
