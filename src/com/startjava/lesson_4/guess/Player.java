package com.startjava.lesson_4.guess;

import java.util.Arrays;

public class Player {
    private int[] enteredNumbers;
    private String name;
    private int tryCount;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[GuessNumber.MAX_TRY_COUNT];
    }

    public int[] getEnteredNumbers() {
        // если попыток не было то не возвращаем null, а вернем массив с нулевой длиной
        return (tryCount > 0 ? Arrays.copyOf(enteredNumbers, tryCount) : new int[0]);
    }

    public int getLastNumber() {
        return tryCount > 0 ? enteredNumbers[tryCount - 1] : 0;
    }

    public void addNumber(int number) {
        if (tryCount == enteredNumbers.length) {
            return;
        }
        enteredNumbers[tryCount] = number;
        tryCount++;
    }

    public String getName() {
        return name;
    }

    public int getTryCount() {
        return tryCount;
    }

    public boolean noMoreTries() {
        return tryCount == enteredNumbers.length;
    }

    public void reset() {
        if (tryCount == 0) {
            return;
        }
        Arrays.fill(enteredNumbers, 0, tryCount, 0);
        tryCount = 0;
    }
}