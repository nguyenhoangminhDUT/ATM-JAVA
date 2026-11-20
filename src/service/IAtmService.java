 
package service;

import model.Account;
import model.AtmVault;
import exception.InvalidAmountException;
import exception.InsufficientBalanceException;
import exception.InsufficientCashException;

public interface IAtmService {

    void withdrawCash(Account account, AtmVault atmVault,
                      double amount)
            throws InvalidAmountException,
                   InsufficientBalanceException,
                   InsufficientCashException;
}

