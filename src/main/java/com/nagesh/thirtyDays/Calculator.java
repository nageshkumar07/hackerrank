package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  30/11/17.
 */
class Calculator {
    class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }

    int power(int x, int y) throws MyCustomException {
        if (x >= 0 && y >= 0) {
            return (int) Math.pow(x, y);
        } else {
            throw new MyCustomException("n and p should be non-negative");
        }
    }
}
