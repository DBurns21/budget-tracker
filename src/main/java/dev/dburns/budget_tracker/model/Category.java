package dev.dburns.budget_tracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="category")
public class Category {

    @Id
    private long id;

    //category names would be what the expense is for like grocery, travel, rent, etc...
    @NotNull
    private String name;

    public Category() {
        name = "";
    }

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
