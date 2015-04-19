package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/19/15.
 */
public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("yes","yes",1992);
    }

    @Test
    public void bookShouldHaveAName() {
        String name = book.getName();
        assertEquals(name, "yes");
    }

    @Test
    public void bookShouldHaveAnAuthor() {
        String author = book.getAuthorName();
        assertEquals(author, "yes");
    }

    @Test
    public void bookShouldHaveYearOfPublishing() {
        int year = book.getYear();
        assertEquals(year, 1992);
    }
}