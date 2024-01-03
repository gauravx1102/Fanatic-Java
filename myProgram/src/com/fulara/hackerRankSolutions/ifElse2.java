
/*Input Format

There are three lines of input:

    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.

Output Format

There are three lines of output:

    On the first line, print String: followed by the unaltered String read from stdin.
    On the second line, print Double: followed by the unaltered double read from stdin.
    On the third line, print Int: followed by the unaltered integer read from stdin.

To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this,
the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).*/

package com.fulara.hackerRankSolutions;
import java.util.*;
public class ifElse2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter the number : ");
//        int n = in.nextInt();
//
//        System.out.print("Enter the double : ");
//        Double db = in.nextDouble();
//
//        in.nextLine();
//        System.out.print("Enter the string : ");
//        String sts = in.nextLine();
//
//        System.out.println(sts);
//        System.out.println(db);
//        System.out.println(n);
//
//
        System.out.println("================================");
        for (int i = 0; i<3; i++) {
            String s1 = in.next();
            int x = in.nextInt();
            System.out.format("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
