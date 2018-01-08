package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  24/12/17.
 */
public class Day29BitwiseAND {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.*/
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();
            int k = scan.nextInt();
            int max = 0;
            for (int j = 1; j < a; j++) {
                for (int l = j+1; l <= a; l++) {
                    if ((j & l) > max && (j & l) < k) {
                        max = j & l;
                    }
                }
            }
            System.out.println(max);
            scan.nextLine();
        }
    }
}