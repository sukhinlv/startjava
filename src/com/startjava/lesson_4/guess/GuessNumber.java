package com.startjava.lesson_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private Player player1;
    private Player player2;
    private int guessedNumber;
    private Random rnd;
    private Scanner sc;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        rnd = new Random();
        sc = new Scanner(System.in);
    }

    public void start() {
        guessedNumber = START_RANGE + rnd.nextInt(END_RANGE - START_RANGE + 1);
        System.out.printf("\nЗагадано число от %d до %d\n", START_RANGE, END_RANGE);
        while (!(isGuessed(player1) || isGuessed(player2))) {}
    }

    private boolean isGuessed(Player player) {
        System.out.printf("\nХодит %s. Введите число: ", player.getName());
        player.setNumber(sc.nextInt());
        sc.nextLine();
        if (player.getNumber() == guessedNumber) {
            System.out.println("\nВерно! Победил игрок " + player.getName());
            return true;
        }
        if (player.getNumber() > guessedNumber) {
            System.out.printf("Число %d больше того, что загадал компьютер\n", player.getNumber());
        } else if (player.getNumber() < guessedNumber) {
            System.out.printf("Число %d меньше того, что загадал компьютер\n", player.getNumber());
        }
        return false;
    }
}