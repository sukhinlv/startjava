package com.startjava.lesson_4.graduation;

import java.util.Arrays;

public class BookShelf {
    public static final int MAX_BOOKS_COUNT = 10;
    private int booksCount;
    private Book[] books;

    public BookShelf() {
        books = new Book[MAX_BOOKS_COUNT];
    }

    public boolean add(String author, String name, int year) {
        if (booksCount == MAX_BOOKS_COUNT) {
            return false;
        }
        books[booksCount] = new Book(author, name, year);
        booksCount++;
        return true;
    }

    public boolean delete(String name) {
        int bookPos = findBookPos(name);
        if (bookPos < 0) {
            return false;
        }
        int len = booksCount - bookPos - 1;
        if (len > 0) {
            System.arraycopy(books, bookPos + 1, books, bookPos, len);
        }
        booksCount--;
        books[booksCount] = null;
        return  true;
    }

    public Book find(String name) {
        int p = findBookPos(name);
        return p < 0 ? null : (Book) books[p].clone();
    }

    public int findBookPos(String name) {
        for (int i = 0; i < booksCount; i++) {
            if (name.equals(books[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, booksCount);
    }

    public int getEmptySpace() {
        return MAX_BOOKS_COUNT - booksCount;
    }

    public int getCount() {
        return booksCount;
    }
}