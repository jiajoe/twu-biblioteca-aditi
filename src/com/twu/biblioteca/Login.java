package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by aditim on 4/24/15.
 */
public class Login {
    private ArrayList<User> listOfUsers;

    public Login() {
        listOfUsers = new ArrayList<>();
        this.listOfUsers.add(new User("Aditi", "aditim@thoughtworks.com", "7680043133", "123-9876", "password1", null, true));
        this.listOfUsers.add(new User("User1", "user1@thoughtworks.com", "7660012315", "345-5678", "password2", null, false));
    }

    public User successfulLogin(String userName, String password) {
        for (User user : this.listOfUsers) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public String listStatus(){
        String result="";
        for(User user: this.listOfUsers){
            result+=user.getName()+" has issued following books\n"+user.getIssuedBooks()+"\n";
        }
        return result;
    }
}
