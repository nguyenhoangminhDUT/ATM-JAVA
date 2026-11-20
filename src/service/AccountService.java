
package service;

import model.Account;
import exception.InvalidAmountException;
import exception.InsufficientBalanceException;

public class AccountService {

    // Deposit money
    public void deposit(Account account, double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Deposit amount must be greater than zero!"
            );
        }

        account.deposit(amount);
    }

    // Withdraw money
    public void withdraw(Account account, double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Withdrawal amount must be greater than zero!"
            );
        }

        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException(
                "Insufficient account balance!"
            );
        }

        account.withdraw(amount);
    }

    // Check balance
    public double checkBalance(Account account) {
        return account.getBalance();
    }
}
