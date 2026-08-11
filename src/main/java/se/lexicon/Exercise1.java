package se.lexicon;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int firstInt = input.nextInt();

            System.out.print("Enter the second integer: ");
            int secondInt = input.nextInt();

            int result = firstInt / secondInt;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
