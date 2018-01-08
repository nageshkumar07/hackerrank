package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  14/11/17.
 */
// Sample Input
 /*1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0*/
public class Day11HourGlass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum = 0;
        int total_sum = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for (int h = 0; h < 4; h++) {
            for (int i = 0; i < 4; i++) {
                for (int j = i; j < i+3; j++) {
                    for (int k = h; k < h+3; k++) {
                        //  System.out.print(arr[j][k]);
                        if((j != i+1) || (k == h+1)) {
                            sum += arr[j][k];
                        }
                        // System.out.print("\t");
                    }
                    //System.out.println();
                }
                if (sum > total_sum || total_sum == Integer.MIN_VALUE) {
                    total_sum = sum;
                }
                //System.out.println("Total sum of this glass : "+sum);
                sum = 0;
                //System.out.println();

            }
        }
        System.out.println(total_sum);
    }
}