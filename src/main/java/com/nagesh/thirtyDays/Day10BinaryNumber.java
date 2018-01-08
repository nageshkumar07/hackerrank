package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  13/11/17.
 */
public class Day10BinaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int j=0,k=0;
        if(in.hasNextInt())
            n = in.nextInt();
        if(n>=1 && n<=1000000){
            String binaryIntInStr = Integer.toBinaryString(n);
            System.out.println(binaryIntInStr);
            char[] cArray = binaryIntInStr.toCharArray();
            for (char ch:cArray) {
                if(Character.getNumericValue(ch) == 1){
                    j++;
                }
                else{
                    if(k<j){
                        k=j;
                    }
                    j=0;
                }
            }
        }
        System.out.println(k);
    }
}
