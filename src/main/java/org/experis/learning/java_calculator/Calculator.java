package org.experis.learning.java_calculator;

public class Calculator {
    // Metodi
    public float add(float num1, float num2) throws IllegalArgumentException {
        if (isInputInvalid(num1, num2)){
            throw new IllegalArgumentException("Invalid input, please insert a number");
        }
        return num1 + num2;
    }

    public float subtract(float num1, float num2) throws IllegalArgumentException {
        if (isInputInvalid(num1, num2)){
            throw new IllegalArgumentException("Invalid input, please insert a number");
        }
        return num1 - num2;
    }

    public float divide(float num1, float num2) throws IllegalArgumentException {
        if (isInputInvalid(num1, num2)){
            throw new IllegalArgumentException("Invalid input, please insert a number");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) throws IllegalArgumentException {
        if (isInputInvalid(num1, num2)){
            throw new IllegalArgumentException("Invalid input, please insert a number");
        }
        return num1 * num2;
    }

    // Validatori
    public boolean isInputInvalid(float num1, float num2) {
        return (Float.isNaN(num1) || Float.isNaN(num2));
    }
}
