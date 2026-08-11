package se.lexicon;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = input.nextLine();
        try {
            emailCheck(email);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        input.close();
    }

    private static void emailCheck(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex == email.length() - 1) {
            throw new IllegalArgumentException("Invalid email address");
        }
    }
}
