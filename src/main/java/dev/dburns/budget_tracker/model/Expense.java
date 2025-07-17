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
    private long id;

    private Instant expenseDate;

    private String description;

    public Expense() {
    }

    public Expense(long id, Instant expenseDate, String description) {
        this.id = id;
        this.expenseDate = expenseDate;
        this.description = description;
    }

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    public long getId() {
        return id;
    }

    public Instant getExpenseDate() {
        return expenseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setExpenseDate(Instant expenseDate) {
        this.expenseDate = expenseDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
