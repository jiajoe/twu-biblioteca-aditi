package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        char response;
        Login login = Login.getInstance();
        MainMenu menu = new MainMenu();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Welcome to Biblioteca App:\nPlease enter your Library Number: ");
            String userName = br.readLine();
            System.out.print("Password: ");
            String password = br.readLine();
            User user = login.successfulLogin(userName, password);
            if (user != null) {
                menu.showMainMenu(user);
            } else {
                System.out.println("Invalid Credentials");
            }

            System.out.print("Login again? (y/n): ");
            response = (char) br.read();
            br.read();
        } while (response == 'y');
    }
}
