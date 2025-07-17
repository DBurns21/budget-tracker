package dev.dburns.budget_tracker.repository;

import dev.dburns.budget_tracker.model.Expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
