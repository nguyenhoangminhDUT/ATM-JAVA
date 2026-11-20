
package model;

public class Transaction {

    // Attributes
    private String transactionId;
    private String accountNumber;
    private String transactionType;
    private double amount;
    private String dateTime;

    // Constructor
    public Transaction(String transactionId, String accountNumber,
                       String transactionType, double amount, String dateTime) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.dateTime = dateTime;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getDateTime() {
        return dateTime;
    }

    // Display transaction information
    public void displayInfo() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
        System.out.println("Date Time: " + dateTime);
    }
}
