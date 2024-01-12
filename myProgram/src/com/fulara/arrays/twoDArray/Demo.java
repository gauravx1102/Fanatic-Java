package com.fulara.arrays.twoDArray;

public class Demo {
    public static void main(String[] args) {

        int [][] a = {{10,20,30,40},{50,60},{70,80,90} };
       /* System.out.println(a);         //[[I@681a9515
        System.out.println(a[0]);      //[I@3af49f1c
        System.out.println(a[0][0]);   //10

        System.out.println(a.length);         //3
        System.out.println(a[0].length);      //4
        //System.out.println(a[0][0].length);   //error : int cannot be dereferenced
*/
       // By for loop

        for(int i = 0; i<a.length; i++){
            for (int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        // By for each loop

        for( int[] i : a){                       // Outer loop for rows
            for (int j : i){                     // Inner loop for elements within each row
                System.out.print(j+ " ");
            }
            System.out.println();                // Newline after each row
        }


    }
}
