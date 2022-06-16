package taskmanager.services.Interface;

import taskmanager.entities.Task;
import taskmanager.enums.State;

import java.util.Date;
import java.util.List;

public interface TaskServiceInterface {

    void createFirstTask();
    void  listTask();

    void addTask(String description);

    boolean updateTaskByStatus(String name, State state);

    void updateTaskByDate(Task task, Date date);

    boolean removeTask(String name);

}
