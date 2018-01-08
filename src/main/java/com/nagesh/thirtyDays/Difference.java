package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  20/11/17.
 */
public class Difference {
    private int[] elements;

    public int maximumDifference;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = Integer.MIN_VALUE;
    }

    void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i; j < elements.length; j++) {
                if (Math.abs(elements[i] - elements[j]) > maximumDifference) {
                    maximumDifference = Math.abs(elements[i] - elements[j]);
                }
            }
        }
    }
}
