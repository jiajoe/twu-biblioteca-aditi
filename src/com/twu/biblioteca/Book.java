package com.twu.biblioteca;

/**
 * Created by aditim on 4/19/15.
 */
public class Book {

    private String name;
    private String authorName;
    private int year;
    private boolean available;

    public Book(String name, String author, int year, boolean available) {
        this.name = name;
        this.authorName = author;
        this.year = year;
        this.available = available;
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

    public boolean setAvailability(boolean b) {
        this.available = b;
        return true;
    }

    public boolean getAvailability() {
        return this.available;
    }
}
