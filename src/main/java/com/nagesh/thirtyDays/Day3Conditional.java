package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  12/11/17.
 */
public class Day3Conditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1){
            ans = "Weird";
        }
        else{
            // Complete the code
            if((n > 1 && n < 6)|| n > 20)
                ans = "Not Weird";
            else
                ans = "Weird";
        }
        System.out.println(ans);
    }
}
