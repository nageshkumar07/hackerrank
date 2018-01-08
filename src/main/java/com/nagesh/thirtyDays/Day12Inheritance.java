package com.nagesh.thirtyDays;

import java.util.Scanner;

/**
 * Created by nageshkumar
 * since  17/11/17.
 */

/*
Sample Input :
Heraldo Memelli 8135627
2
100 80
*/
public class Day12Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
