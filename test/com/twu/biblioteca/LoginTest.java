package com.twu.biblioteca;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aditim on 4/29/15.
 */
public class LoginTest {

    @Test
    public void userShouldLoginWithCorrectCredentials(){
        Login login=new Login();
        User actual=new User("Aditi","aditim@thoughtworks.com","7680043133","123-9876","password1",null,true);
        User expected=login.successfulLogin("123-9876","password1");
        assertEquals(expected.getIsLibrarian(),actual.getIsLibrarian());
    }

}