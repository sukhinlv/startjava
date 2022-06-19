package com.startjava.lesson_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {    
        // если не указывать "cp866" то при вводе русских букв в имени игрока потом выводятся ???
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("\nВведите имя первого игрока: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(sc.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.start();
        } while (isNext(sc));
    }

    private static boolean isNext(Scanner sc) {
        String choice;
        do {
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            choice = sc.nextLine().toLowerCase();
        } while (!choice.equals("yes") && !choice.equals("no"));
        return choice.equals("yes");
    }
}