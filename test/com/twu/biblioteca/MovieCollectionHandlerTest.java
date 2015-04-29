package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/24/15.
 */
public class MovieCollectionHandlerTest {
    MovieCollectionHandler collection;
    Movie movie1, movie2;

    @Before
    public void setup() {
        collection = new MovieCollectionHandler();
        movie1 = new Movie("Dark Knight Rises", 2010, "Christopher Nolan", 9, true);
        movie2 = new Movie("Roy", 2014, "Someone", 7, true);
    }

    @Test
    public void movieShouldBeAddedToTheCollection() {
        boolean expected = collection.addMovie(movie1);
        assertEquals(expected, true);
    }

    @Test
    public void movieShouldBeCheckedOutFromTheCollection() {
        collection.addMovie(movie1);
        boolean expected = collection.checkOutMovie("Dark Knight Rises");
        assertEquals(expected, true);
    }

}