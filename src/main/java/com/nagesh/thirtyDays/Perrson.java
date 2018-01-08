package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  17/11/17.
 */
public class Perrson {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Perrson(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
