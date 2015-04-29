package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditim on 4/19/15.
 */
public class MainMenu {
    private BookCollectionHandler bookHandler = new BookCollectionHandler();
    private MovieCollectionHandler movieHandler = new MovieCollectionHandler();

    public String listBooks() {
        return bookHandler.listAll();
    }

    public void addBookForTest(Book book) {
        bookHandler.add(book);
    }

    public boolean checkOutBook(String name,User user) {
        Book result = bookHandler.searchByName(name);

        if (result != null) {
            boolean checkOut = bookHandler.checkOut(result, user);
            if (checkOut)
                System.out.println("Thank you! Enjoy the book.");
            return true;
        }

        System.out.println("That book is not available.");
        return false;
    }

    public boolean returnBook(String bookName, User user) {
        for (Book b : bookHandler.collection) {
            if (b.getName().equals(bookName)) {
                System.out.println("Thank you for returning the book.");
                user.removeIssuedBooks(b);
                return b.setAvailability(true);
            }
        }
        System.out.println("That is not a valid book to return.");
        return false;
    }

    public String listMovies() {
        return movieHandler.listAll();
    }

    public void addMovieForTest(String name, double year, String director, int rating, boolean available) {
        movieHandler.addMovie(new Movie(name, year, director, rating, available));
    }

    public boolean checkOutMovie(String movieName) {
        boolean result = movieHandler.checkOutMovie(movieName);
        return result;
    }

    public void mainMenuForCustomer(User user) throws IOException {
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {

            System.out.print("Choose option: 1. List Books 2. Checkout Book 3. Return Book 4. List Movies 5.Checkout Movie 6. Quit\nChoice: ");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println(bookHandler.listAll());
                    break;

                case 2:
                    System.out.print("Enter the book name: ");
                    String book = br.readLine();
                    if (!checkOutBook(book, user)) ;
                    System.out.print("Enter a valid Book name");
                    break;

                case 3:
                    System.out.print("Enter the book Name: ");
                    String bookName = br.readLine();
                    returnBook(bookName, user);
                    break;

                case 4:
                    System.out.println(movieHandler.listAll());
                    break;

                case 5:
                    System.out.print("Enter the Movie Name: ");
                    String movieName = br.readLine();
                    if (checkOutMovie(movieName))
                        System.out.println("Thank you!! Enjoy the Movie.");
                    else
                        System.out.println("Checkout could not be processed");
                    break;
                case 6:
                    break;

                default:
                    System.out.println("Select a valid option!");
                    break;
            }

        } while (choice != 6);
    }

    public String showStatus(){
        String list;
        list=new Login().listStatus();
        return list;
    }


    public void mainMenuForLibrarian() throws IOException {
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {

            System.out.print("Choose option: 1. List Books 2. Add Book 3. Check Status 4. Quit\nChoice: ");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println(bookHandler.listAll());
                    break;

                case 2:
                    System.out.print("Enter the book Name: ");
                    String bookName = br.readLine();
                    System.out.print("Enter the book Author: ");
                    String author = br.readLine();
                    System.out.print("Enter the book Year: ");
                    int year = Integer.parseInt(br.readLine());

                    bookHandler.add(new Book(bookName, author, year, true));
                    break;

                case 3:
                    System.out.println(showStatus());

                    break;

                case 4:
                    break;

                default:
                    System.out.println("Select a valid option!");
                    break;
            }

        } while (choice != 4);
    }

    public void showMainMenu(User user) throws IOException {
        addBookForTest(new Book("ABC", "XYZ", 1992, true));
        addBookForTest(new Book("DEF", "PQR", 1993, true));
        movieHandler.addMovie(new Movie("Ghost Writer", 2010, "Roman Polanski", 7, true));
        movieHandler.addMovie(new Movie("Grown ups", 2008, "Something", 6 , true));
        if (user.getIsLibrarian())
            mainMenuForLibrarian();
        else
            mainMenuForCustomer(user);

    }


}
