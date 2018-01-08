package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  17/11/17.
 */
public class Student extends Perrson {
    private int[] testScores;

    public String firstName;

    public String lastName;

    public int id;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = testScores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        int average = sum / testScores.length;
        if (average <= 100 && average >= 90) {
            return 'O';
        } else if (average < 90 && average >= 80) {
            return 'E';
        } else if (average < 80 && average >= 70) {
            return 'A';
        } else if (average < 70 && average >= 55) {
            return 'P';
        } else if (average < 55 && average >= 40) {
            return 'D';
        } else {
            return 'T';
        }

    }
}