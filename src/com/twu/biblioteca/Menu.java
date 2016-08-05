package com.twu.biblioteca;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Created by mczech on 05/08/16.
 */
public class Menu {

    private Map<Character, String> options = new HashMap<>();
    private Map<Character, Action> actions = new HashMap<>();
    private char nextOptionKey = 'a';

    public void addOption(String option) {
        options.put(nextOptionKey, option);
        nextOptionKey++;
    }

    public void show() {
        for(Character optionKey : options.keySet())
            System.out.println(optionKey + ") " + options.get(optionKey));
    }

    public void readInput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.length() > 1)
            throw new IOException("Input must consist of exactly one character.");
        actions.get(input.charAt(0)).apply();
    }

    public void addOption(String option, Action action) {
        actions.put(nextOptionKey, action);
        addOption(option);
    }
}
