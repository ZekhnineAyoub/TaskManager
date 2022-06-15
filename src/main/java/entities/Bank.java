package entities;

import enums.State;

import java.util.Date;
import java.util.List;

public class Bank {

    private long id;
    private String name;
    private String type;
    private Date date;
    private String description;
    private String adresse;
    private State state;
    private List<User> users;

    public Bank() {
    }

    public Bank(String name, String type, Date date, String description, String adresse, State state, List<User> users) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.description = description;
        this.adresse = adresse;
        this.state = state;
        this.users = users;
    }

    public Bank(long id, String name, String type, Date date, String description, String adresse, State state, List<User> users) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.date = date;
        this.description = description;
        this.adresse = adresse;
        this.state = state;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", adresse='" + adresse + '\'' +
                ", state=" + state +
                ", users=" + users +
                '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
