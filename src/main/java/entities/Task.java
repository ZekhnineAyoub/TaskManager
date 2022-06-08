package entities;

import enums.State;

import java.util.Date;
import java.util.List;

public class Task {

    private long id;
    private Date creationDate;
    private Date dueDate;
    private Date closeDate;
    private State state;
    private String description;
    private List<Subtasks> subtasks;

    public List<Subtasks> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<Subtasks> subtasks) {
        this.subtasks = subtasks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
