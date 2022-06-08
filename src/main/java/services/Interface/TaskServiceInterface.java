package services.Interface;

import entities.Task;

import java.util.Date;
import java.util.List;

public interface TaskServiceInterface {

     List<Task> listTasks();

     void addTask(Task task);

     void updateTaskByStatus(Task task);

     void updateTaskByDate(Task task,Date date);

     void removeTask(Task task);



}
