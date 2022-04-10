package com.foxminded.calculator;

import java.util.Scanner;

/**
 * Вывод информации через консоль, ввод чисел
 */
public class Choose {
    Scanner scanner = new Scanner(System.in);

    public void chooseDigits() {
        LogicOfCalculator logicOfCalculator = new LogicOfCalculator();
        do {
            System.out.println("Введите число и нажмите Enter");
            double firstInputNumber = readNumber();
            System.out.println("Введите какой вид операции выполнить и нажмите Enter:\n" +
                    " + сложение \n - вычетание  \n / деление \n * умножение");
            String sign = scanner.next();
            System.out.println("Введите второе число и нажмите Enter");
            double secondInputNumber = readNumber();

            try {
                double result = logicOfCalculator.calculation(firstInputNumber, secondInputNumber, sign);
                System.out.printf("%.1f %s %.1f = %.1f\n", firstInputNumber, sign, secondInputNumber, result);
                System.out.println("Хотите сделать ещё один расчёт?\n Введите Y - YES или N - NO и нажмите Enter");
            } catch (ArithmeticException | IllegalArgumentException a) {
                System.out.println(a);
                System.out.println("Хотите сделать ещё один расчёт?\n Введите Y - YES или N - NO и нажмите Enter");
            }
        } while (repeatCalculator());

        scanner.close();
    }

    public double readNumber(){
        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        } else System.out.print("Некоректный ввод, попробуйте ещё раз: ");
        scanner.next();
        return readNumber();
    }

    public boolean repeatCalculator() {
        String repeat = scanner.next();
        if (repeat.equalsIgnoreCase("Y")) {
            return true;
        } else if (repeat.equalsIgnoreCase("N")) {
            return false;
        } else System.out.print("Некоректный ввод, попробуйте ещё раз: ");
        return repeatCalculator();
    }
}
