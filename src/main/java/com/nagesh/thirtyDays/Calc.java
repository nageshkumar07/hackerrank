package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  03/12/17.
 */
public class Calc implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
