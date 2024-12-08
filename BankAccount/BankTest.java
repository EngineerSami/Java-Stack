package com.mycompany.banktest;

   public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        account1.deposit("checking", 500);
        account1.deposit("savings", 300);

        account2.deposit("checking", 1000);
        account2.deposit("savings", 2000);

        account3.deposit("checking", 150);
        account3.deposit("savings", 50);

        // Withdrawal Test
        account1.withdraw("checking", 200);
        account1.withdraw("savings", 100);

        account2.withdraw("checking", 1500); // Should show insufficient funds
        account2.withdraw("savings", 500);

        account3.withdraw("checking", 50);
        account3.withdraw("savings", 100); // Should show insufficient funds

        // Static Test
        System.out.println("Total number of accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("Total money in all accounts: $" + BankAccount.getTotalMoney());
    }
}
