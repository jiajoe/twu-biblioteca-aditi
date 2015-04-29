package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/22/15.
 */
public class MovieTest {
    Movie movie = new Movie("Ghost Writer", 2010, "Roman Polanski", 7, true);

    @Test
    public void movieShouldHaveAName() {
        String expected = movie.getName();
        assertEquals(expected, "Ghost Writer");
    }

    @Test
    public void movieShouldHaveAnYear() {
        double expected = movie.getYear();
        assertEquals(expected, 2010, 0.1);
    }

    @Test
    public void movieShouldHaveADirector() {
        String expected = movie.getDirector();
        assertEquals(expected, "Roman Polanski");
    }
}