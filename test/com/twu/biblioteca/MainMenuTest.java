package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by aditim on 4/19/15.
 */
public class MainMenuTest {
    private MainMenu mainMenu;

    @Before
    public void setUp() {
        mainMenu = new MainMenu();
    }

    @Test
    public void mainMenuShouldListAvailableBooks() {
        String expected = "ABC DEF";

        mainMenu.addBookForTest(new Book("ABC", "XYZ", 1992));
        mainMenu.addBookForTest(new Book("DEF", "PQR", 1993));

        assertEquals(mainMenu.listBooks(), expected);
    }

    @Test
    public void mainMenuShouldCheckOutBook() {
        Book b = new Book("ABC", "XYZ", 1992);

        mainMenu.addBookForTest(b);

        assertTrue(mainMenu.checkOut("ABC"));
    }

    @Test
    public void mainMenuShouldReturnBook() {
        Book b = new Book("ABC", "XYZ", 1992);

        mainMenu.addBookForTest(b);
        mainMenu.checkOut("ABC");

        assertTrue(mainMenu.returnBook(b));
    }

    @After
    public void tearDown() {
        mainMenu.clearForTest();
    }
}