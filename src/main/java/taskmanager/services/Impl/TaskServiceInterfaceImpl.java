package taskmanager.services.Impl;

import taskmanager.component.ConvertToJson;
import taskmanager.entities.Task;
import taskmanager.enums.State;
import taskmanager.services.Interface.TaskServiceInterface;
import com.google.gson.Gson;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskServiceInterfaceImpl implements TaskServiceInterface {

     List<Task> taskData= new ArrayList<Task>();


    @Override
    public void createFirstTask() {
        //String path = "src/main/java/taskmanager/data/data.json";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        List<Task> tasks = new ArrayList<>();
        List<Task> subTasks = new ArrayList<>();
        Task subTasks1  = new Task(1,"task1",new Date(System.currentTimeMillis()),new Date(),new Date(),"project to create an app",State.todo,null);
        Task subTasks2  = new Task(2,"task2",new Date(System.currentTimeMillis()),new Date(),new Date(),"projet en cours",State.progress,null);
        subTasks.add(subTasks1);
        subTasks.add(subTasks2);


        Task taskMaster1 =  new Task(1,"Task Manager 1",new Date(System.currentTimeMillis()),new Date(),new Date(),"project manager",State.todo,subTasks);
        Task taskMaster2 =  new Task(1,"Task Manager 2",new Date(System.currentTimeMillis()),new Date(),new Date(),"project manager 2",State.todo,null);

        tasks.add(taskMaster1);
        tasks.add(taskMaster2);
        taskData.add(taskMaster1);
        taskData.add(taskMaster2);
        ConvertToJson convertToJson = new ConvertToJson();
        ConvertToJson.ToJson(taskData);

    }

    @Override
    public void listTask() {

        System.out.println(taskData);

    }


    @Override
    public void addTask(String name) {

        Task task =  new Task(1,name,new Date(System.currentTimeMillis()),new Date(),new Date(),null,State.todo,null);
        this.taskData.add(task);
        ConvertToJson.ToJson(taskData);

    }

    @Override
    public boolean updateTaskByStatus(String name,State state) {

        boolean taskUpdate = false;
        for (int i =0; i<taskData.size();i++)
        {
            if(taskData.get(i).getName().equals(name)) {

                taskData.get(i).setState(state);
                taskUpdate = true;
            }
        }
        ConvertToJson.ToJson(taskData);

        return taskUpdate;
    }

    @Override
    public boolean removeTask(String name) {

        boolean taskRemove = false;
        for (int i =0; i<taskData.size();i++)
        {
            if(taskData.get(i).getName().equals(name)) {
                taskData.remove(i);
                taskRemove = true;
                System.out.println(taskData);
            }
        }
        ConvertToJson.ToJson(taskData);
        return  taskRemove;
    }


    @Override
    public void updateTaskByDate(Task task, Date date) {

    }

}
