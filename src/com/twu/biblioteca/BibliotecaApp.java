package com.twu.biblioteca;

import java.time.Year;
import java.util.Arrays;

public class BibliotecaApp {

    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca!";

    private Book library;

    public BibliotecaApp(Book book) {
        this.library = book;
    }

    public BibliotecaApp() {
        this.library = new Book("", "", Year.of(0));
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public void showWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }

    public void listBooks() {
        System.out.println("(1) " + String.join(", ", library.getTitle(), library.getAuthor(), library.getPublicationYear().toString()) +  " [AVAILABLE]");
    }
}
