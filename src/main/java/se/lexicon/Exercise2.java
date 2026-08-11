package se.lexicon;

import se.lexicon.exception.ValueOutOfRangeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number to check: ");
            int number = input.nextInt();
            inRangeOf100(number);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input, please enter an integer!");
        } catch (ValueOutOfRangeException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void inRangeOf100(int input) throws ValueOutOfRangeException {
        if (input < 100 && input > 0) {
            System.out.println("The number " + input + " is in range of 100");
        } else {
            throw new ValueOutOfRangeException("The number " + input + " is out of range", input);
        }
    }
}
