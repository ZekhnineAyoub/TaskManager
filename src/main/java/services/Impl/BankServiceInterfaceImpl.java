package services.Impl;

import com.google.gson.Gson;
import entities.Bank;
import entities.User;
import enums.State;
import services.Interface.BankServiceInterface;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankServiceInterfaceImpl implements BankServiceInterface {

    @Override
    public void createFirstBank() {
        String path = "src/main/java/data/data.json";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        ArrayList<Bank> banks = new ArrayList<>();
        List<User> users = new ArrayList<>();


        User user1 = new User(1,"sawti",
                "christphe",
                "sawtiChristophe@hotmail.com",
                "quatre routes paris");
        User user2 = new User(2,"eric",
                "Perrot",
                "ericPerrot@hotmail.com",
                "Strasbourg 145 rue daniel");

        users.add(user1);
        users.add(user2);
        Bank bank1  = new Bank(1,"la banque postale",
                "finance",
                new Date(System.currentTimeMillis()),
                "nstitution financiere essentielle qui collecte l epargne,",
                "paris", State.todo,users);

        banks.add(bank1);
        Gson gson = new Gson();
        String objectBankToJson = gson.toJson(bank1);
        System.out.println(objectBankToJson);

        try (PrintWriter out = new PrintWriter(new FileWriter(path))) {
            out.write(objectBankToJson);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Bank> listBank() {
        return null;
    }


    @Override
    public void addBank(Bank bank) {

    }

    @Override
    public void updateBankByStatus(Bank bank) {

    }

    @Override
    public void updateBankByDate(Bank bank, Date date) {

    }

    @Override
    public void removeBank(Bank bank) {

    }
}
