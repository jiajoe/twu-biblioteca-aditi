package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by aditim on 4/22/15.
 */
public class User {
    private String name;
    private String email;
    private String phNumber;
    private String libNumber;
    private String password;
    private ArrayList<Book> issuedBooks;
    private boolean isLibrarian;

    public User(String name, String email, String phNumber, String libNumber, String password, ArrayList<Book> issuedBooks, boolean isLibrarian) {
        this.name = name;
        this.email = email;
        this.phNumber = phNumber;
        this.libNumber = libNumber;
        this.password = password;
        this.issuedBooks = issuedBooks;
        this.isLibrarian = isLibrarian;
        this.issuedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public boolean isLibrarian() {
        return this.isLibrarian;
    }

    public String getUserName() {
        return this.libNumber;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean addIssuedBooks(Book b) {
        return this.issuedBooks.add(b);
    }

    public boolean removeIssuedBooks(Book b) {
        return this.issuedBooks.remove(b);
    }

    public String getIssuedBooks() {
        String res = "";

        for (Book b : this.issuedBooks) {
            res += b.getName() + "\n";
        }
        return res;
    }
}
