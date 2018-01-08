package com.nagesh.challenge;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  06/10/17.
 */
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uu = sc.nextLine();
        System.out.println(uu);
        String[] uuu = uu.split(" ");
        for (String u: uuu) {
            System.out.println(u);
        }
    }
}
