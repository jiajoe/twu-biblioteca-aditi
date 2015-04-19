package com.twu.biblioteca;

/**
 * Created by aditim on 4/19/15.
 */
public class Book {

    private String name;
    private String authorName;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.authorName = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }
}
