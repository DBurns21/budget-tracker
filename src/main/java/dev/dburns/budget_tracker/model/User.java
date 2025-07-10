package dev.dburns.budget_tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name="user")
public class User {

    @Id
    private Long id;

    private String name;

    private String email;

    @OneToMany
    private Set<Category> category;

}
