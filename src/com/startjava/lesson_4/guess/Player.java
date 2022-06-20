package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int tryCount;
    private int[] enteredNumbers;

    public Player(String name, int maxTryCount) {
        this.name = name;
        enteredNumbers = new int[maxTryCount];
    }

    public void resetEnteredData() {
        if (tryCount == 0) {
            return;
        }
        Arrays.fill(enteredNumbers, 0, tryCount, 0);
        tryCount = 0;
    }

    public boolean noMoreTries() {
        return (tryCount == enteredNumbers.length);
    }

    public int[] getEnteredNumbers() {
        // если попыток не было то не возвращаем null, а вернем массив с нулевой длиной
        return (tryCount > 0 ? Arrays.copyOf(enteredNumbers, tryCount) : new int[0]);
    }
    public int getTryCount() {
        return tryCount;
    }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return (tryCount > 0 ? enteredNumbers[tryCount - 1] : 0);
    }

    public void setNumber(int number) {
        if (tryCount == enteredNumbers.length) {
            System.out.printf("У %s закончились попытки!\n", name);
            return;
        }
        enteredNumbers[tryCount] = number;
        tryCount++;
    }
}