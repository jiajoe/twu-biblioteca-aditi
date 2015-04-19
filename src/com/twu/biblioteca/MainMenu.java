package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditim on 4/19/15.
 */
public class MainMenu {
    private BookCollectionHandler handler = new BookCollectionHandler();

    public String listBooks() {
        return handler.listAll();
    }

    public void addBookForTest(Book book) {
        handler.add(book);
    }

    public void clearForTest() {
        handler.removeAll();
    }

    public boolean checkOut(String name) {
        Book result = handler.searchByName(name);

        if (result != null) {
            handler.remove(result);
            System.out.println("Thank you! Enjoy the book.");
            return true;
        }

        System.out.println("“That book is not available.");
        return false;
    }

    public boolean returnBook(Book b) {
        if (handler.add(b)) {
            System.out.println("Thank you for returning the book.");
            return true;
        }

        System.out.println("That is not a valid book to return.");
        return false;
    }

    public void showMainMenu() throws IOException {
        int choice;

        addBookForTest(new Book("ABC", "XYZ", 1992));
        addBookForTest(new Book("DEF", "PQR", 1993));

        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Choose option: 1. List Books 2. Checkout 3. Return 4. Quit\nChoice: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.println(handler.listAll());
                    break;

                case 2:
                    System.out.print("Enter the book name: ");
                    String book = br.readLine();
                    checkOut(book);
                    break;

                case 3:
                    System.out.print("Enter the book Name: ");
                    String bookName = br.readLine();
                    System.out.print("Enter the book Author: ");
                    String author = br.readLine();
                    System.out.print("Enter the book Year: ");
                    int year = Integer.parseInt(br.readLine());

                    returnBook(new Book(bookName, author, year));
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Select a valid option!");
                    break;
            }
        } while (choice != 4);
    }
}
