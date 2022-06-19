package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        String[] entertedExp;
        do {
            System.out.print("\nВведите математическое выражение (например 2 ^ 10): ");
            entertedExp = sc.nextLine().split(" ");
            calc.setA(Integer.parseInt(entertedExp[0]));
            calc.setSign(entertedExp[1].charAt(0));
            calc.setB(Integer.parseInt(entertedExp[2]));

            System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() + " = " + calc.calculate());
        } while (isNext(sc));
    }
    private static boolean isNext(Scanner sc) {
        String choice = "";
        do {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            choice = sc.nextLine().toLowerCase();
        } while (!choice.equals("yes") && !choice.equals("no"));
        return choice.equals("yes");
    }
}