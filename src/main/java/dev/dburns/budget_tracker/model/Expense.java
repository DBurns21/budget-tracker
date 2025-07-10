package dev.dburns.budget_tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name="expense")
public class Expense {

    @Id
    private int id;

    private Instant expenseDate;

    private String description;

    public Expense() {
    }

    public Expense(int id, Instant expenseDate, String description) {
        this.id = id;
        this.expenseDate = expenseDate;
        this.description = description;
    }

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    public int getId() {
        return id;
    }

    public Instant getExpenseDate() {
        return expenseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExpenseDate(Instant expenseDate) {
        this.expenseDate = expenseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
