package dev.dburns.budget_tracker.repository;

import dev.dburns.budget_tracker.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    //Category findByName(String name);
}
