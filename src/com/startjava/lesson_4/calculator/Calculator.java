package com.startjava.lesson_4.calculator;

public class Calculator {
    public static int calculate(String mathExpression) throws NumberFormatException {
        String[] expressionParts = mathExpression.split(" ");
        if (expressionParts.length != 3) {
            throw new IllegalArgumentException("Выражение должно состоять из трех частей, разделенных пробелами!");
        }
        int a;
        char sign;
        int b;
        try {
            a = Integer.parseInt(expressionParts[0]);
            sign = expressionParts[1].charAt(0);
            b = Integer.parseInt(expressionParts[2]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("В выражении допустимо использовать только целые положительные числа!");
        }
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("В выражении допустимо использовать только целые положительные числа!");
        }
        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '^' -> (int) Math.pow(a, b);
            case '%' -> a % b;
            default -> throw new IllegalArgumentException("Неизвестный знак " + sign);
        };
    }    
}