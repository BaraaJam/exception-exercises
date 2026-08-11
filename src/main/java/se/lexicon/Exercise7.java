package se.lexicon;

import se.lexicon.exception.DuplicateNameException;
import se.lexicon.exception.NameNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Anna", "Baraa", "Carl", "Diana"));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name to search for: ");
        String nameToFind = input.nextLine().toLowerCase();

        try {
            findName(names, nameToFind);
        } catch (NameNotFoundException e){
            System.err.println(e.getMessage());
        }


        try {
            addName(names, "baraa");
        } catch (DuplicateNameException e) {
            System.err.println(e.getMessage());
        }

        input.close();
    }

    private static void findName(List<String> names, String name) throws NameNotFoundException {
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                System.out.println(name + " found");
                return;
            }
        }
        throw new NameNotFoundException("Name '" + name + "' not found");
    }

    private static void addName(List<String> names, String name) throws DuplicateNameException {
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                throw new DuplicateNameException("Name '" + name + "' is already in the list");
            }
        }
        names.add(name);
        System.out.println(name + " added");
    }
}
