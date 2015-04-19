package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/19/15.
 */
public class BookCollectionHandlerTest {

    private BookCollectionHandler handler;

    @Before
    public void setUp() {
        handler = new BookCollectionHandler();
    }

    @Test
    public void bookShouldBeAddedToCollection() {
        handler.add(new Book("ABC", "XYZ", 1990));
        assertEquals(handler.getSize(), 1);
    }

    @Test
    public void bookShouldBeRemovedFromTheCollection() {
        Book book = new Book("ABC", "XYZ", 1990);
        handler.add(book);
        handler.remove(book);
        assertEquals(handler.getSize(), 0);
    }

    @Test
    public void bookShouldBeSearchedFromTheCollection() {
        String bookName = "ABC";
        handler.add(new Book("ABC", "XYZ", 1990));
        assertEquals(handler.searchByName(bookName).getName(), bookName);
    }

    @After
    public void tearDown() {
        handler.removeAll();
    }
}