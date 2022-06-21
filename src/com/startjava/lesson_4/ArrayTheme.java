package com.startjava.lesson_4;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        printArr(intArr);
        reverseArr(intArr);
        printArr(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        intArr[9] = 9;
        int multNumbers = 1;
        for (int i = 1; i < 9; i++) {
            intArr[i] = i;
            multNumbers *= i;
            System.out.print(i < 8 ? i + " * " : i + " = " + multNumbers + "\n");
        }
        System.out.println("[0] = " + intArr[0]);
        System.out.println("[9] = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        Random rnd = new Random();
        int len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = rnd.nextDouble();
        }
        printArr(doubleArr);
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > doubleArr[len / 2]) {
                doubleArr[i] = 0;
                counter++;
            }
        }
        printArr(doubleArr);
        System.out.println("Ячеек обнулено: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        // чтобы не выводить весь английский алфавит инициализируем массив только шестью символами начиная с U
        char[] charArr = new char[6];
        len = charArr.length;
        char ch = 'U';
        for (int i = 0; i < len; i++) {
            charArr[i] = ch++;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(charArr[len - j - 1]);
            }
            System.out.println();
        }

        System.out.println("\n 5. Генерация уникальных чисел");
        intArr = new int[30];
        boolean uniqNum;
        int rndNum;
        for (int i = 0; i < intArr.length; i++) {
            do {
                uniqNum = true;
                rndNum = 60 + rnd.nextInt(100 - 60 + 1);
                for (int j = 0; j <= i; j++) {
                    if (intArr[j] == rndNum) {
                        uniqNum = false;
                        break;
                    }
                }
            } while (!uniqNum);
            intArr[i] = rndNum;
        }
        Arrays.sort(intArr);
        printArr(intArr, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        // посчитаем все непустые элементы, чтобы создать массив-приемник
        String[] stringArr = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        counter = 0;
        for (String str : stringArr) {
            if (str.isBlank()) {
                counter++;
            }
        }
        String[] stringResultArr = new String[counter];
        // счетчик идущих подряд непустых элементов
        counter = 0;
        len = stringArr.length;
        // указатель на очередную позицию для записи в массиве-приемнике
        int resultPos = 0;
        for (int i = 0; i < len; i++) {
            // если попался пустой элемент, то копируем все предшествующие непустые элементы в массив-приемник
            if (stringArr[i].isBlank()) {
                if (counter != 0) {
                    System.arraycopy(stringArr, i - counter, stringResultArr, resultPos, counter);
                    resultPos += counter;
                    counter = 0;
                }
            } else {
                counter++;
            }
        }
        // обрабатываем последние элементы массива, после которых нет пустой строки
        if (counter > 0) {
            System.arraycopy(stringArr, len - counter, stringResultArr, resultPos, counter);
        }
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringResultArr));

        System.out.println();
    }

    public static void reverseArr(int[] arr) {
        int tmp;
        int len;
        for (int i = 0; i <= arr.length / 2; i++) {
            len = arr.length - i - 1;
            tmp = arr[len];
            arr[len] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void printArr(double[] arr) {
        for (double num : arr) {
            System.out.printf("%.3f ", num);
        }
        System.out.println();
    }

    public static void printArr(int[] arr) {
        printArr(arr, 0);
    }

    public static void printArr(int[] arr, int numsInLine) {
        int counter = 0;
        for (int num : arr) {
            System.out.print(num + " ");
            counter++;
            if ((numsInLine != 0) && (counter % numsInLine == 0)) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
