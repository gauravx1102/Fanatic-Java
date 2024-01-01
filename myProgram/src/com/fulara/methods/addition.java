package com.fulara.methods;

import java.util.*;
public class addition {

    public static int claculateSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int sum = claculateSum(a, b);
        System.out.println(sum);
    }
}
