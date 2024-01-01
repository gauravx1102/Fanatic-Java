/*Whatever number the user enters, it will show him the digits coming on the number*/

package com.fulara.Loops;


import java.util.Scanner;
public class fabonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = in.nextInt();

        int a = 0;
        int b = 1;

        for (int count = 2; count <= num; count++){
            int temp = b;
            b = a + b;
            a = temp;

        }
        System.out.println(b);
    }
}
