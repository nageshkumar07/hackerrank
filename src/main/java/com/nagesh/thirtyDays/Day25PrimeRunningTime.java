package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  13/12/17.
 */
public class Day25PrimeRunningTime {
    static int[] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        for (int num: a) {
            boolean flag = true;
            if(num == 0 || num == 1) {
                System.out.println("Not prime");
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i == 0)
                    flag = false;
            }
            if(flag){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }
}
