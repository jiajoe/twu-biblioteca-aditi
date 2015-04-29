package com.twu.biblioteca;

/**
 * Created by aditim on 4/22/15.
 */
public class Movie {
    private String name;
    private double year;
    private String director;
    private int rating;
    private boolean available;

    public Movie(String name, double year, String director, int rating, boolean available) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public boolean setAvailability(boolean set) {
        this.available = false;
        return true;
    }

    public boolean getAvailability() {
        return this.available;
    }
}
