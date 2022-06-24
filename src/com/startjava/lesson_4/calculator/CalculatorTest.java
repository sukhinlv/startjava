package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nВведите математическое выражение (например 2 ^ 10): ");
            try {
                System.out.println("Результат вычисления: " + Calculator.calculate(sc.nextLine()));
            } catch (IllegalArgumentException e) {
                System.out.print("ОШИБКА: " + e.getMessage());
            }
        } while (isNext(sc));
    }

    private static boolean isNext(Scanner sc) {
        String choice;
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            choice = sc.nextLine().toLowerCase();
        } while (!choice.equals("yes") && !choice.equals("no"));
        return choice.equals("yes");
    }
}