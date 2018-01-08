package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  12/11/17.
 */
public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        String[] names = new String[T];
        for (int i = 0; i < T; i++) {
            names[i] = sc.nextLine();
        }
        for (String name:names) {
            char[] cArray = name.toCharArray();
            for(int i=0;i<cArray.length;i++){
                if(i%2 == 0)
                    System.out.print(cArray[i]);
            }
            System.out.print(" ");
            for(int i=0;i<cArray.length;i++){
                if(i%2 != 0)
                    System.out.print(cArray[i]);
            }
            System.out.println();
        }
    }
}