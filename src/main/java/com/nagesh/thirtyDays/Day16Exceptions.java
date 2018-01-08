package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  20/11/17.
 */
public class Day16Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        int i;
        try {
            i = Integer.parseInt(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
