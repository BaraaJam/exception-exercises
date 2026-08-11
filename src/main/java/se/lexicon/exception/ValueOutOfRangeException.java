package se.lexicon.exception;

public class ValueOutOfRangeException extends Exception {

    private int number;

    public ValueOutOfRangeException() {
        super();
    }

    public ValueOutOfRangeException(String message, int number) {
        super(message);
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.getMessage() + " | Number: " + number;
    }
}
