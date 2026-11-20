
package model;

public class AtmVault {

    // Attributes
    private double totalCash;

    // Constructor
    public AtmVault(double totalCash) {
        this.totalCash = totalCash;
    }

    // Getter
    public double getTotalCash() {
        return totalCash;
    }

    // Add cash to ATM
    public boolean addCash(double amount) {
        if (amount <= 0) {
            return false;
        }

        totalCash += amount;
        return true;
    }

    // Remove cash from ATM
    public boolean removeCash(double amount) {
        if (amount <= 0 || amount > totalCash) {
            return false;
        }

        totalCash -= amount;
        return true;
    }

    // Display ATM cash
    public void displayCash() {
        System.out.println("Total cash in ATM: " + totalCash);
    }
}

