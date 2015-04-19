package com.twu.biblioteca;

import java.util.LinkedHashSet;

/**
 * Created by aditim on 4/19/15.
 */
public class BookCollection {
    private LinkedHashSet<Book> list;

    BookCollection() {
        list = new LinkedHashSet<>();
    }

    public LinkedHashSet<Book> getList() {
        return list;
    }

    public void setList(LinkedHashSet<Book> list) {
        this.list = list;
    }

    public int getSize() {
        return this.list.size();
    }
}
