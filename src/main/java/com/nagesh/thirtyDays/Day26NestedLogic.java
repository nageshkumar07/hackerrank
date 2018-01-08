package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  19/12/17.
 */
public class Day26NestedLogic {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String actual = scan.nextLine();
        String expected = scan.nextLine();
        scan.close();

        String[] actual_date = actual.split(" ");
        String[] expected_date = expected.split(" ");

        int total_days = 0;

        int[] actualArray = new int[actual_date.length];
        for (int i = 0; i < actual_date.length; i++) {
                String numberAsString = actual_date[i];
                actualArray[i] = Integer.parseInt(numberAsString);
            if(actualArray[i] <= 0) {
                System.out.println(total_days);
                System.exit(0);
            }
        }

        int[] expectedArray = new int[expected_date.length];
        for (int i = 0; i < expected_date.length; i++) {
            String numberAsString = expected_date[i];
            expectedArray[i] = Integer.parseInt(numberAsString);
            if(expectedArray[i] <= 0) {
                System.out.println(total_days);
                System.exit(0);
            }
        }



        for (int i = 2; i >= 0; i--) {
            if (i == 2) {
                int years_delay = actualArray[i] - expectedArray[i];
                if (years_delay > 0 && years_delay <= 2999) {
                    total_days = 10000;
                    break;
                }
                else if(years_delay < 0){
                    break;
                }
            }

            if (i == 1) {
                int months_delay = actualArray[i] - expectedArray[i];
                if (months_delay > 0 && months_delay < 11) {
                    total_days = 500 * months_delay;
                    break;
                }
                else if(months_delay < 0){
                    break;
                }
            }

            if (i == 0) {
                int days_delay = actualArray[i] - expectedArray[i];
                if (days_delay > 0 && days_delay < 30) {
                    total_days = 15 * days_delay;
                    break;
                }
            }
        }

        if (total_days >= 0) {
            System.out.println(total_days);
        }
    }
}