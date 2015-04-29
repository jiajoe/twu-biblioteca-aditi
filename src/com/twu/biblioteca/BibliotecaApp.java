package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        int i = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Welcome to Biblioteca App:\nPlease enter your Library Number: ");
            String userName = br.readLine();
            System.out.print("Password: ");
            String password = br.readLine();
            Login login = new Login();
            User user = login.successfulLogin(userName, password);
            if (user != null) {
                new MainMenu().showMainMenu(user);
            } else {
                System.out.println("Invalid Credentials. Press 1 to enter again");
                i = Integer.parseInt(br.readLine());
            }
        } while (i == 1);
    }
}
