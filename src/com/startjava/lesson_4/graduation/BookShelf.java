package com.startjava.lesson_4.graduation;

public class BookShelf {
    public static final int MAX_BOOKS_COUNT = 10;
    private int booksCount;
    private Book[] books;

    public BookShelf() {
        books = new Book[MAX_BOOKS_COUNT];
    }

    public int getBooksCount() {
        return booksCount;
    }

    public Book[] getBooks() {
        Book[] arr = new Book[booksCount];
        System.arraycopy(books, 0, arr, 0, booksCount);
        return arr;
    }

    public int getEmptySpace() {
        return MAX_BOOKS_COUNT - booksCount;
    }

    public Book findBookByName(String name) {
        for (int i = 0; i < booksCount; i++) {
            if (name.equals(books[i].getName())) {
                return (Book) books[i].clone();
            }
        }
        return null;
    }

    public boolean deleteBookByName(String name) {
        for (int i = 0; i < booksCount; i++) {
            if (name.equals(books[i].getName())) {
                int movelen = booksCount - i - 1;
                if (movelen > 0) {
                    System.arraycopy(books, i + 1, books, i, movelen);
                }
                booksCount--;
                books[booksCount] = null;
                return  true;
            }
        }
        return false;
    }

    public boolean addBook(String author, String name, int year) {
        if (booksCount == MAX_BOOKS_COUNT) {
            return false;
        }
        books[booksCount] = new Book(author, name, year);
        booksCount++;
        return true;
    }
}