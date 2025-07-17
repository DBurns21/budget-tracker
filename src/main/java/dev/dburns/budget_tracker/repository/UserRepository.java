package dev.dburns.budget_tracker.repository;

import dev.dburns.budget_tracker.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
