
package model;

public class SavingsAccount extends Account {

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Display account information
    @Override
    public void displayInfo() {
        System.out.println("Account Type: Savings Account");
        super.displayInfo();
    }
}

