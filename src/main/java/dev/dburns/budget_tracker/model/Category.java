package dev.dburns.budget_tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    private int id;

    //category names would be what the expense is for like grocery, travel, rent, etc...
    private String name;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return  id;
    }
    public  String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
