package taskmanager.entities;


import taskmanager.enums.State;

import java.util.Date;
import java.util.List;

public class Task {

    private long id;
    private String name;

    private Date createDate;
    private Date closeDate;
    private Date dueDate;
    private String description;
    private State state;
    private List<Task> tasks;

    public Task(long id, String name, Date createDate, Date closeDate, Date dueDate, String description, State state, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.closeDate = closeDate;
        this.dueDate = dueDate;
        this.description = description;
        this.state = state;
        this.tasks = tasks;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", closeDate=" + closeDate +
                ", dueDate=" + dueDate +
                ", description='" + description + '\'' +
                ", state=" + state +
                ", tasks=" + tasks +
                '}';
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
