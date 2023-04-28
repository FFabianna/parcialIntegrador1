package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String ID;
    private String name;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}

