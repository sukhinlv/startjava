package com.startjava.lesson_4;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        printArr(intArr);
        printArr(reverseArr(intArr));

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        intArr[9] = 9;
        int multNumbers = 1;
        for (int i = 1; i < 9; i++) {
            intArr[i] = i;
            multNumbers *= i;
            System.out.print(i < 8 ? i + " * " : i);
        }
        System.out.println(" = " + multNumbers);
        System.out.println("[0] = " + intArr[0]);
        System.out.println("[9] = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        Random rnd = new Random();
        int counter = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = rnd.nextDouble();
        }
        printArr(doubleArr);
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > doubleArr[doubleArr.length / 2]) {
                doubleArr[i] = 0;
                counter++;
            }
        }
        printArr(doubleArr);
        System.out.println("Ячеек обнулено: " + counter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        // чтобы не выводить весь английский алфавит инициализируем массив только шестью символами начиная с U
        char[] charArr = new char[6];
        charArr[0] = 'U';
        for (int i = 1; i < charArr.length ; i++) {
            charArr[i] = (char) (charArr[i-1] + 1);
        }
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(charArr[charArr.length - j - 1]);
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
                for (int j = 0; j <= i ; j++) {
                    if (intArr[j] == rndNum) {
                        uniqNum = false;
                        break;
                    }
                }
            } while (!uniqNum);
            intArr[i] = rndNum;
        }
        Arrays.sort(intArr);
        intArr = reverseArr(intArr);
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
        // указатель на очередную позицию для записи в массиве-приемнике
        int resultPos = 0;
        for (int i = 0; i < stringArr.length; i++) {
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
            System.arraycopy(stringArr, stringArr.length - counter, stringResultArr, resultPos, counter);
        }
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringResultArr));

        System.out.println();
    }

    public static int[] reverseArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i <= arr.length / 2; i++) {
            newArr[i] = arr[arr.length - i - 1];
            newArr[arr.length - i - 1] = arr[i];
        }
        return newArr;
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
