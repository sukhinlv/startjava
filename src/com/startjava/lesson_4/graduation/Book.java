package com.startjava.lesson_4.graduation;

public class Book {
    private String author;
    private String name;
    private int publishYear;

    public Book(String author, String name, int publishYear) {
        this.author = author;
        this.name = name;
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public Object clone() {
        return new Book(author, name, publishYear);
    }

    @Override
    public String toString() {
        return "[" + author + ", " + name + ", " + publishYear + "]";
    }
}