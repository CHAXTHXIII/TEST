package com.example.demo;

/**
 * Simple digital safe to demonstrate encapsulation.
 */
public class DigitalSafe {

    private final String ownerName;
    private double balance;

    public DigitalSafe(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0d;
    }

    /**
     * Deposit positive amount of money to the safe.
     *
     * @param amount positive amount to deposit
     * @return updated balance
     * @throws IllegalArgumentException when amount is zero or negative
     */
    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

