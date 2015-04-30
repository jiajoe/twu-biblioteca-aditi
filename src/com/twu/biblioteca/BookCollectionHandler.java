package com.twu.biblioteca;

import java.util.LinkedHashSet;

/**
 * Created by aditim on 4/19/15.
 */
public class BookCollectionHandler {
    LinkedHashSet<Book> collection;

    public BookCollectionHandler() {
        collection = new LinkedHashSet<>();
    }

    public boolean add(Book book) {
        return collection.add(book);
    }

    public boolean checkOut(Book book, User user) {
        for (Book b : collection) {
            if (b.getName().equals(book.getName())) {
                if (!b.getAvailability()) {
                    System.out.println("Book is already checked out.");
                    return false;
                }
                user.addIssuedBooks(book);
                return b.setAvailability(false);
            }
        }
        return false;
    }

    public int getSize() {
        return collection.size();
    }

    public void removeAll() {
        collection.clear();
    }

    public String listAll() {
        String list = "";

        for (Book b : collection) {
            if (b.getAvailability())
                list += b.getName() + " ";
        }

        return list.trim();
    }

    public Book searchByName(String bookName) {
        for (Book b : collection) {
            if (b.getName().equals(bookName))
                return b;
        }

        return null;
    }
}
