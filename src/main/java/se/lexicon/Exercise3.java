package se.lexicon;

import se.lexicon.exception.InsufficientBalanceException;

public class Exercise3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        System.out.println("Balance: " + account.getBalance());

        try {
            account.withdraw(900);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        }
    }
}
