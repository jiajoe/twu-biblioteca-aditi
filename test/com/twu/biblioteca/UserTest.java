package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/22/15.
 */
public class UserTest {
    User customer = new User("Aditi", "aditim@thoughtworks.com", "7680043133", "456-7788", "aditim", null, false);

    @Test
    public void userShouldHaveAName() {
        String expected = customer.getName();
        assertEquals(expected, "Aditi");
    }

    @Test
    public void userShouldHaveAnEmail() {
        String expected = customer.getEmail();
        assertEquals(expected, "aditim@thoughtworks.com");
    }

    @Test
    public void userShouldHaveAPhoneNumber() {
        String expected = customer.getPhNumber();
        assertEquals(expected, "7680043133");
    }


}