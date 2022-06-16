package taskmanager;

import taskmanager.enums.State;
import taskmanager.services.Impl.TaskServiceInterfaceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class CommandLine  {

    public static void main (String [] args)
    {

        TaskServiceInterfaceImpl taskServiceInterface = new TaskServiceInterfaceImpl();
        //taskServiceInterface.createFirstTask();
        //System.out.println("votre gestionnaire de tache est initialisée");
        /* exemple:
          agenda add task TaskName */

        System.out.println("Gestionnaire de Task: saisissez votre commande ");
        System.out.println("commande 1: agenda add task taskName");
        System.out.println("commande 2: agenda list task");
        System.out.println("commande 3: agenda remove taskName");
        System.out.println("commande 4: agenda update taskName -s: taskStatus");

        Scanner scanner = new Scanner(System.in);
        String command  = scanner.nextLine();
        System.out.println(command);
        do{

            if(command.contains("agenda add task"))
            {
                String[] parts = command.split(" ");
                String name = parts[3];
                taskServiceInterface.addTask(name);
                System.out.println("votre task a éte ajoutee.");

            } else if (command.contains("agenda list task")) {

                System.out.println("voici la liste des tasks ");
                taskServiceInterface.listTask();


            } else if (command.contains("agenda remove")) {

                  String[] parts = command.split(" ");
                  String name = parts[2];
                  if(taskServiceInterface.removeTask(name))
                  System.out.println("votre task a été supprimée");
                  else  System.out.println("votre task n'exite pas");
            } else if (command.contains("agenda update") && command.contains("-s:")) {
                String[] parts = command.split(" ");
                String name= parts[2];

                State state = State.valueOf(parts[4]);
                if(taskServiceInterface.updateTaskByStatus(name,state))
                    System.out.println("votre task a été modofié ");
                else  System.out.println("Error");
            }
            else System.out.println("Commande inconnu, s'il vous plait respecter la syntaxe de commande");
            command  = scanner.nextLine();
            }while (command.equals("exit")==false);



    }
}
