package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/19/15.
 */
public class BookCollectionHandlerTest {

    private BookCollection list;

    @Before
    public void instantiateOnce() {
        list = new BookCollection();
    }

    @Test
    public void bookShouldBeAddedToCollection() {
        LinkedHashSet<Book> testList = list.getList();
        Book book = new Book("ABC", "XYZ", 1990);
        testList.add(book);
        list.setList(testList);
        assertEquals(list.getSize(), 1);
    }

    @Test
    public void bookShouldBeRemovedFromTheCollection() {
        LinkedHashSet<Book> testList = list.getList();
        Book book = new Book("ABC", "XYZ", 1990);
        testList.add(book);
        testList.remove(book);
        assertEquals(list.getSize(), 0);
    }

    //
//    @Test
//    public void bookShouldBeSearched(){
//        LinkedHashSet<Book> testList=list.getList();
//
//    }
//
//    @Test
    @After
    public void tearDown() {
        list.setList(null);
    }
}