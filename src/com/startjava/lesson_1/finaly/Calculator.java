package com.startjava.lesson_1.finaly;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        char sign = '^';

        System.out.println("Калькулятор");
        int result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = a;
            for (int i = 2; i <= b; i++) {
                result *=  a;
            }
        } else if (sign == '%') {
            result = a % b;
        } else {
            System.out.println("Неизвестное вычисление!");
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
