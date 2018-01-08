package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  03/12/17.
 */
public class Printer<T> {
    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param
     **/

    // Write your code here
    void printArray(Object[] obj){
        for(Object o:obj){
            System.out.println(o);
        }
    }
}
