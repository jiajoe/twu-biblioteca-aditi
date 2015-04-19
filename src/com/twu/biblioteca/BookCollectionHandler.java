package com.twu.biblioteca;

import java.util.Iterator;
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

    public void remove(Book book) {
        collection.remove(book);
    }

    public int getSize() {
        return collection.size();
    }

    public void removeAll() {
        collection.clear();
    }

    public String listAll() {
        String list = "";

        for (Book b : collection)
            list += b.getName() + " ";

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
