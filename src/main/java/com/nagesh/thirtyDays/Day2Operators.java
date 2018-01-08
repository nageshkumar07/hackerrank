package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  12/11/17.
 */
public class Day2Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tipCost = (mealCost * tipPercent)/100;
        double taxCost = (mealCost * taxPercent)/100;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost+tipCost+taxCost);

        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}
