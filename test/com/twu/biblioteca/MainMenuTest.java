package com.twu.biblioteca;

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

        mainMenu.addBookForTest(new Book("ABC", "XYZ", 1992, true));
        mainMenu.addBookForTest(new Book("DEF", "PQR", 1993, true));

        assertEquals(mainMenu.listBooks(), expected);
    }

    @Test
    public void mainMenuShouldCheckOutBook() {
        Book b = new Book("ABC", "XYZ", 1992, true);
        User customer = new User("Aditi", "aditim@thoughtworks.com", "7680043133", "456-7788", "aditim", null, false);
        mainMenu.addBookForTest(b);

        assertTrue(mainMenu.checkOutBook("ABC",customer));
    }

    @Test
    public void mainMenuShouldReturnBook() {
        Book b = new Book("ABC", "XYZ", 1992, true);
        User customer = new User("Aditi", "aditim@thoughtworks.com", "7680043133", "456-7788", "aditim", null, false);
        mainMenu.addBookForTest(b);
        mainMenu.checkOutBook("ABC",customer);

        assertTrue(mainMenu.returnBook("ABC",customer));
    }

    @Test
    public void mainMenuShouldListMovies() {
        String expected = "ABC DEF";
        mainMenu.addMovieForTest("ABC", 2010, "Roman Polanski", 7, true);
        mainMenu.addMovieForTest("DEF", 2010, "Roman Polanski", 7, true);

        assertEquals(expected, mainMenu.listMovies());
    }

    @Test
    public void mainMenuShouldCheckOutMovie() {
        mainMenu.addMovieForTest("ABC", 2010, "Roman Polanski", 7, true);
        boolean expected = mainMenu.checkOutMovie("ABC");
        assertEquals(expected, true);

    }

}