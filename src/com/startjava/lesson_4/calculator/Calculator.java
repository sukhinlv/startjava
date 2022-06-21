package com.startjava.lesson_4.calculator;

public class Calculator {
    public int calculate(String mathExpression) {
        String[] expressionParts = mathExpression.split(" ");
        int a = Integer.parseInt(expressionParts[0]);
        char sign = expressionParts[1].charAt(0);
        int b = Integer.parseInt(expressionParts[2]);
        return switch (sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Деление на 0! Операция не выполнена.");
                    yield 0;
                }
                yield a / b;
            }
            case '^' -> {
                if (b >= 0) {
                    yield (int) Math.pow(a, b);
                }
                System.out.printf("Нельзя возвести в степень %d! Операция не выполнена.\n", b);
                yield 0;
            }
            case '%' -> {
                if (b == 0) {
                    System.out.println("Деление на 0! Операция не выполнена.");
                    yield 0;
                }
                yield a % b;
            }
            default -> {
                System.out.printf("Неизвестный знак \"%s\"! Операция не выполнена.\n", sign);
                yield 0;
            }
        };
    }    
}