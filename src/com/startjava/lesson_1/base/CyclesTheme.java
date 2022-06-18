package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = -10; i <= 21; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.format("в промежутке [-10, 21] сумма четных чисел = %d, а нечетных = %d%n",
                sumEven, sumOdd);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int min;
        int max;
        if (number1 > number2) {
            max = number1;
            min = number2;
        } else {
            max = number2;
            min = number1;
        }
        if (number3 > max) {
            max = number3;
        } else if (number3 < min) {
            min = number3;
        }
        System.out.format("числа в интервале (%d, %d):%n", max, min);
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        int currDigit;
        System.out.print("исходное число в обратном порядке: ");
        while (srcNum > 0) {
            currDigit = srcNum % 10;
            srcNum /= 10;
            sumDigits += currDigit;
            System.out.print(currDigit);
        }
        System.out.println("\tсумма цифр числа: " + sumDigits);

        System.out.println("\n4. Вывод чисел [1, 24) на консоль в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.format("%4d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i <= (5 - counter % 5); i++) {
            System.out.format("%4d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int tmpNum = srcNum;
        int countOne = 0;
        while (tmpNum > 0) {
            if (tmpNum % 10 == 1) {
                countOne++;
            }
            tmpNum /= 10;
        }
        if (countOne % 2 == 0) {
            System.out.format("число %d содержит %d (четное) количество единиц%n",
                    srcNum, countOne);
        } else {
            System.out.format("число %d содержит %d (нечетное) количество единиц%n",
                    srcNum, countOne);
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        // отображаем фигуру из *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // отображаем фигуру из #
        int lineCounter = 5;
        counter = 0;
        while (lineCounter > 0) {
            counter = lineCounter;
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            System.out.println();
            lineCounter--;
        } 
        System.out.println();

        // отображаем фигуру из $
        int ouputCounter = 1;
        lineCounter = 1;
        counter = 1;
        do {
            ouputCounter = 1;
            do {
                System.out.print("$");
                ouputCounter++;
            } while (ouputCounter <= counter);
            System.out.println();
            lineCounter++;
            if (lineCounter <= 3) {
                counter++;
            } else {
                counter--;
            }
        } while (lineCounter <= 5);

        System.out.println("\n7. Отображение ASCII-символов");
        // TODO: разобраться как вывести символ, а не команду для первых 12 символов ASCII
        System.out.println("символы, идущие до цифр и имеющие нечетные коды:");
        System.out.println("  Dec  Char");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.format("%5d     %c%n", i, (char) i);
            }
        }
        System.out.println("\nмаленькие английские буквы, имеющие четные коды:");
        System.out.println("  Dec  Char");
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.format("%5d     %c%n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        tmpNum = srcNum;
        int controlNum = 0;
        while (tmpNum > 0) {
            controlNum = controlNum * 10 + tmpNum % 10;
            tmpNum /= 10;
        }
        if (srcNum == controlNum) {
            System.out.format("число %d является палиндромом%n", srcNum);
        } else {
            System.out.format("число %d НЕ является палиндромом%n", srcNum);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 123132;
        sumDigits = 0;
        while (srcNum > 0) {
            if (srcNum / 1000 > 0) {
                sumDigits += srcNum % 10;
            } else {
                sumDigits -= srcNum % 10;
            }
            srcNum /= 10;
        }
        if (sumDigits == 0) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число НЕ является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("   |  2  3  4  5  6  7  8  9");
        System.out.println("----------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.format("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.format("%3d", i * j);
            }
            System.out.println();
        }
   }
}