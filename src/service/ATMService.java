
package service;

import model.Account;
import model.AtmVault;
import exception.InvalidAmountException;
import exception.InsufficientBalanceException;
import exception.InsufficientCashException;

public class ATMService implements IAtmService  {

    private AccountService accountService;

    // Constructor
    public ATMService() {
        accountService = new AccountService();
    }

    // Withdraw cash from ATM
    @Override
    public void withdrawCash(Account account, AtmVault atmVault,
                             double amount)
            throws InvalidAmountException,
                   InsufficientBalanceException,
                   InsufficientCashException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Withdrawal amount must be greater than zero!"
            );
        }

        if (amount > atmVault.getTotalCash()) {
            throw new InsufficientCashException(
                "ATM does not have enough cash!"
            );
        }

        accountService.withdraw(account, amount);
        atmVault.removeCash(amount);
    }
}
