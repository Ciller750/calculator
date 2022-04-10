package com.foxminded.calculator;

/**
 * Логика калькулятора
 */
public class LogicOfCalculator {
    public double calculation(double firstInputNumber, double secondInputNumber, String sign) throws IllegalArgumentException, ArithmeticException {

        switch (sign) {
            case "+":
                return firstInputNumber + secondInputNumber;
            case "-":
                return firstInputNumber - secondInputNumber;
            case "*":
                return firstInputNumber * secondInputNumber;
            case "/":
                if (secondInputNumber == 0) {
                    throw new ArithmeticException("На ноль делить нельзя");
                }
                return firstInputNumber / secondInputNumber;
            default:
                throw new IllegalArgumentException("Введён неправильный знак: " + sign);
        }
    }
}