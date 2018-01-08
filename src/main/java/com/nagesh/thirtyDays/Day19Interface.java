package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  03/12/17.
 */
public class Day19Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calc();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
