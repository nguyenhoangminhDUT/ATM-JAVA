
package model;

public class CheckingAccount extends Account {

    // Constructor
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Display account information
    @Override
    public void displayInfo() {
        System.out.println("Account Type: Checking Account");
        super.displayInfo();
    }
}

