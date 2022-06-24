package com.startjava.lesson_4.graduation;

import java.util.Scanner;

public class BookShelfTest {
    public static final int MENU_COUNT = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookShelf bs = new BookShelf();
        int selectedMenu;
        String name;
        String author;
        int year;
        Book someBook;
        do {
            printBookShelf(bs.getBooks());
            printMenu();
            selectedMenu = selectMenu(sc);
            // использовал if вместо switch для улучшения читаемости
            if (selectedMenu == 1) {
                System.out.println("\nДобавление книги на полку");
                System.out.print("Автор: ");
                author = sc.nextLine();
                System.out.print("Название книги: ");
                name = sc.nextLine();
                System.out.print("Год выхода в печать: ");
                year = 0;
                try {
                    year = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException ignored) {}
                if (year <= 0) {
                    System.out.println("\nГод указан неверно!");
                    continue;
                }
                if (!bs.addBook(author, name, year)) {
                    System.out.println("\nНе удалось добавить книгу, нет места!");
                }
            } else if (selectedMenu == 2) {
                System.out.print("\nУдаление книги. Введите название: ");
                System.out.println(bs.deleteBookByName(sc.nextLine()) ? "\nКнига успешно удалена" : "\nКнига не найдена!");
            } else if (selectedMenu == 3) {
                System.out.print("\nПоиск книги. Введите название: ");
                someBook = bs.findBookByName(sc.nextLine());
                System.out.println((someBook != null) ? someBook.getName() : "\nКнига не найдена!");
            } else if (selectedMenu == 4) {
                System.out.println("\nКоличество книг на полке: " + bs.getBooksCount());
            } else if (selectedMenu == 5) {
                System.out.println("\nСвободных мест на полке: " + bs.getEmptySpace());
            } else if (selectedMenu == 6) {
                break;
            }
        } while (true);
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

    private static void printBookShelf(Book[] books) {
        System.out.println("\nСОДЕРЖИМОЕ КНИЖНОЙ ПОЛКИ:");
        if (books.length == 0) {
            System.out.println("<пусто>");
        }
        for (Book b : books) {
            System.out.println("[" + b.getAuthor() + ", " + b.getName() + ", " + b.getPublishYear() + "]");
        }
    }

    private static int selectMenu(Scanner sc) {
        int selected;
        do {
            System.out.print("Введите пункт меню: ");
            selected = 0;
            try {
                selected = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ignored) {}
            if (selected > 0 && selected <= MENU_COUNT) {
                break;
            }
            System.out.println("Введено неверное значение!");
        } while (true);
        return selected;
    }
}