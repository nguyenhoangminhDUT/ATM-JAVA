package dao;

import model.Account;
import java.util.List;

public interface IAccountDAO {

    void save(Account account);

    Account findByAccountNumber(String accountNumber);

    List<Account> findAll();

    void update(Account account);

    void delete(String accountNumber);
}