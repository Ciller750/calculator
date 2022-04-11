package com.foxminded.calculator;

/**
 * Запускает программу калькулятор.
 */
public class Application {
    public static void main(String[] args) {
        Choose choose = new Choose();
        choose.chooseDigits();
    }
}