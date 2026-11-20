package dao;

import model.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements IAccountDAO {

    private List<Account> accounts;

    public AccountDAOImpl() {
        accounts = new ArrayList<>();
    }

    @Override
    public void save(Account account) {
        accounts.add(account);
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public void update(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber()
                    .equals(account.getAccountNumber())) {
                accounts.set(i, account);
                return;
            }
        }
    }

    @Override
    public void delete(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber()
                    .equals(accountNumber)) {
                accounts.remove(i);
                return;
            }
        }
    }
}