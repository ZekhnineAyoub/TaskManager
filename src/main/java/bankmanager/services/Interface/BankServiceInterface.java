package bankmanager.services.Interface;

import bankmanager.entities.Bank;

import java.util.Date;
import java.util.List;

public interface BankServiceInterface {

    void createFirstBank();
    List<Bank> listBank();

    void addBank(Bank bank);

    void updateBankByStatus(Bank bank);

    void updateBankByDate(Bank bank, Date date);

    void removeBank(Bank bank);
}
