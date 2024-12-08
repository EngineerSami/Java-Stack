package com.mycompany.banktest;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0;
    private static double totalMoney = 0.0;

    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        accounts++;
    }

    // GETTERS
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    public void deposit(String accountType, double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        if (accountType.equalsIgnoreCase("checking")) {
            this.checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            this.savingsBalance += amount;
        } else {
            System.out.println("Invalid account type. Use 'checking' or 'savings'.");
            return;
        }

        totalMoney += amount;
        System.out.println("Deposited $" + amount + " to " + accountType + " account. Current balance: " + getBalance(accountType));
    }

    public void withdraw(String accountType, double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (accountType.equalsIgnoreCase("checking")) {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
                System.out.println("Withdrew $" + amount + " from checking account. Remaining balance: " + this.checkingBalance);
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
                System.out.println("Withdrew $" + amount + " from savings account. Remaining balance: " + this.savingsBalance);
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        } else {
            System.out.println("Invalid account type. Use 'checking' or 'savings'.");
        }
    }

    public double getBalance(String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            return this.checkingBalance;
        } else if (accountType.equalsIgnoreCase("savings")) {
            return this.savingsBalance;
        } else {
            System.out.println("Invalid account type. Use 'checking' or 'savings'.");
            return 0.0;
        }
    }

    public void displayBalances() {
        System.out.println("Checking Balance: " + this.checkingBalance);
        System.out.println("Savings Balance: " + this.savingsBalance);
    }
}
