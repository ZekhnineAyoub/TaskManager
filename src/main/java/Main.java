import com.google.gson.Gson;
import entities.Bank;
import entities.User;
import enums.State;
import services.Impl.BankServiceInterfaceImpl;
import services.Interface.BankServiceInterface;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main (String [] args)
    {

        BankServiceInterfaceImpl bankServiceInterface = new BankServiceInterfaceImpl();
        bankServiceInterface.createFirstBank();


    }
}
