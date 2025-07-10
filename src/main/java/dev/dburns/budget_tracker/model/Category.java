package dev.dburns.budget_tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    private Long id;

    //category names would be what the expense is for like grocery, travel, rent, etc...
    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

}
