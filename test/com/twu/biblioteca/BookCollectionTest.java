package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/19/15.
 */
public class BookCollectionTest {

    @Test
    public void bookCollectionShouldStoreAListOfBooks() {
        BookCollection library = new BookCollection();
        int expected=library.getList().size();
        assertEquals(expected, 0);
    }

}