package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  12/11/17.
 */
public class Day5Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=2 && n<=20){
            for(int i=1;i<=10;i++){
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
    }
}
