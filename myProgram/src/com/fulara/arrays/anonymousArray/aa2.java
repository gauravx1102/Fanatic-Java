package com.fulara.arrays.anonymousArray;

public class aa2 {
    public static void main(String[] args) {
        subtract(new int[][] {{12,11,-10,2,3},{2,7,1,-45}});
    }
    public static void subtract(int[][] a){
        int total = 0;
        for(int[] ii : a){
            for(int i : ii){
                  total = total - i;
            }
        }

        System.out.println(total);
    }
}
