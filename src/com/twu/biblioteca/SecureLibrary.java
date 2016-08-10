package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class SecureLibrary<T extends LibraryItem> implements ILibrary {

    protected Library<T> library;

    private Map<Integer, UserSession> accountabilities = new HashMap<>();

    public SecureLibrary(T ... items) {
        library = new Library<>(items);
    }

    @Override
    public void checkoutItemWithId(int itemId) {
        if(!UserSession.isLoggedIn())
            throw new IllegalStateException("You must be logged in to check-out an item!");
        library.checkoutItemWithId(itemId);
        accountabilities.put(itemId, UserSession.getSession());
    }

    @Override
    public boolean isCheckedOut(int itemId) {
        return library.isCheckedOut(itemId);
    }

    @Override
    public void returnItemWithId(int itemId) {
        if(!UserSession.isLoggedIn())
            throw new IllegalStateException("You must be logged in to return an item!");
        library.returnItemWithId(itemId);
        accountabilities.remove(itemId);
    }

    public Map<Integer, UserSession> getAccountabilities() {
        return accountabilities;
    }
}
