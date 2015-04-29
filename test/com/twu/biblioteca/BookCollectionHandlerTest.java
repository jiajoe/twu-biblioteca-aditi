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
        handler.add(new Book("ABC", "XYZ", 1990, true));
        assertEquals(handler.getSize(), 1);
    }

    @Test
    public void bookShouldBeRemovedFromTheCollection() {
        User u=new User("Aditi","aditim@thoughtworks.com","7680043133","123-9876","password1",null,true);
        Book book = new Book("ABC", "XYZ", 1990, true);
        handler.add(book);
        assertEquals(handler.checkOut(book,u), true);
    }

    @Test
    public void bookShouldBeSearchedFromTheCollection() {
        String bookName = "ABC";
        handler.add(new Book("ABC", "XYZ", 1990, true));
        assertEquals(handler.searchByName(bookName).getName(), bookName);
    }

    @After
    public void tearDown() {
        handler.removeAll();
    }
}