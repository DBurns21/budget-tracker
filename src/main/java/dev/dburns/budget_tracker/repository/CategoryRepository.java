package dev.dburns.budget_tracker.repository;

import dev.dburns.budget_tracker.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findById(Long id);

    //Category findByName(String name);
}
