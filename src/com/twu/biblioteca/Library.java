package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by mczech on 05/08/16.
 */
public class Library {

    private List<Book> books = new ArrayList<>();

    private Set<Book> checkedOut = new HashSet<>();

    public Library(Book ...books) {
        for(Book b : books)
            this.books.add(b);
    }

    public void listBooks() {
        IntStream.range(0, books.size()).forEach(i ->
                System.out.println("(" + (i+1) + ") " + books.get(i) +  " [AVAILABLE]")
        );
    }

    public void checkout(int bookId) {
        Book book = tryToGetBookById(bookId);
        checkedOut.add(book);
    }

    private Book tryToGetBookById(int bookId) {
        try {
            return books.get(bookId);
        } catch(IndexOutOfBoundsException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }

    public boolean isCheckedOut(int bookId) {
        return checkedOut.contains(books.get(bookId));
    }
}
