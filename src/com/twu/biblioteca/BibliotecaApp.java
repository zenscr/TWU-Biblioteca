package com.twu.biblioteca;

public class BibliotecaApp {

    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca!";

    public BibliotecaApp(Book book) {

    }

    public BibliotecaApp() {

    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public void showWelcomeMessage() {
        System.out.println(WELCOME_MESSAGE);
    }

    public void listBooks() {
        System.out.println("(1) Brave New World, Aldous Huxley, 1932 [AVAILABLE]");
    }
}
