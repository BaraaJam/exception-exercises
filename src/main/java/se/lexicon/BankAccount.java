package se.lexicon;

import se.lexicon.exception.InsufficientBalanceException;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance: requested " + amount + ", available " + balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
