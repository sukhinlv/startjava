package com.startjava.lesson_4.graduation;

import java.util.Scanner;

public class BookShelfTest {
    public static final int MENU_COUNT = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookShelf bs = new BookShelf();
        int selectedMenu;
        do {
            printBookShelf(bs.getBooks());
            printMenu();
            selectedMenu = selectMenu(sc);
            switch (selectedMenu) {
                case 1 -> {
                    String name;
                    String author;
                    int year = 0;
                    System.out.println("\nДобавление книги на полку");
                    System.out.print("Автор: ");
                    author = sc.nextLine();
                    System.out.print("Название книги: ");
                    name = sc.nextLine();
                    System.out.print("Год выхода в печать: ");
                    try {
                        year = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException ignored) {
                    }
                    if (year <= 0) {
                        System.out.println("\nГод указан неверно!");
                        continue;
                    }
                    if (!bs.add(author, name, year)) {
                        System.out.println("\nНе удалось добавить книгу, нет места!");
                    }
                }
                case 2 -> {
                    System.out.print("\nУдаление книги. Введите название: ");
                    System.out.println(bs.delete(sc.nextLine()) ? "\nКнига успешно удалена" : "\nКнига не найдена!");
                }
                case 3 -> {
                    Book someBook;
                    System.out.print("\nПоиск книги. Введите название: ");
                    someBook = bs.find(sc.nextLine());
                    System.out.println((someBook != null) ? "\nКнига найдена: " + someBook : "\nКнига не найдена!");
                }
                case 4 -> System.out.println("\nКоличество книг на полке: " + bs.getCount());
                case 5 -> System.out.println("\nСвободных мест на полке: " + bs.getEmptySpace());
            }
        } while (selectedMenu != 6);
    }

    private static void printBookShelf(Book[] books) {
        System.out.println("\nСОДЕРЖИМОЕ КНИЖНОЙ ПОЛКИ:");
        if (books.length == 0) {
            System.out.println("<пусто>");
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static void printMenu() {
        System.out.println("""
                       \nМЕНЮ:
                       1. добавить книгу
                       2. удалить книгу
                       3. найти книгу по названию
                       4. вывести количество книг на полке
                       5. вывести количество свободных мест
                       6. выход
                       """);
    }

    private static int selectMenu(Scanner sc) {
        int menuItem;
        do {
            System.out.print("Введите пункт меню: ");
            menuItem = 0;
            try {
                menuItem = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ignored) {}
            if (menuItem > 0 && menuItem <= MENU_COUNT) {
                break;
            }
            System.out.println("Введено неверное значение!");
        } while (true);
        return menuItem;
    }
}