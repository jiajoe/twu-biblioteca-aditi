package com.twu.biblioteca;

import java.util.LinkedHashSet;

/**
 * Created by aditim on 4/24/15.
 */
public class MovieCollectionHandler {
    LinkedHashSet<Movie> collection;

    public MovieCollectionHandler() {
        collection = new LinkedHashSet<>();
    }

    public boolean addMovie(Movie movie) {
        return collection.add(movie);
    }

    public boolean checkOutMovie(String s) {
        for (Movie m : collection) {
            if (m.getName().equals(s)) {
                if(m.getAvailability()==false){
                    System.out.println("Movie is already checked out.");
                    return false;
                }
                return m.setAvailability(false);
            }
        }
        return false;
    }

    public String listAll() {
        String list = "";
        for (Movie m : collection) {
            list += m.getName() + " ";
        }
        return list.trim();
    }

    public Movie searchByName(String movieName) {
        for (Movie m : collection) {
            if (m.getName().equals(movieName)) {
                return m;
            }
        }
        return null;
    }

}
