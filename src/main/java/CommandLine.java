import bankmanager.services.Impl.BankServiceInterfaceImpl;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CommandLine  {

    public static void main (String [] args)
    {

        //System.out.println(args[0]);
        //System.out.println(args[1]);
        //System.out.println(args[2]);

        BankServiceInterfaceImpl bankServiceInterface = new BankServiceInterfaceImpl();
        bankServiceInterface.createFirstBank();

    }
}
