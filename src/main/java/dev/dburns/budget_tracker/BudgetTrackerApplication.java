package dev.dburns.budget_tracker;

import dev.dburns.budget_tracker.model.Category;
import dev.dburns.budget_tracker.model.Expense;
import dev.dburns.budget_tracker.model.User;
import dev.dburns.budget_tracker.repository.CategoryRepository;
import dev.dburns.budget_tracker.repository.ExpenseRepository;
import dev.dburns.budget_tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.time.Instant;


@SpringBootApplication
public class BudgetTrackerApplication implements  CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ExpenseRepository expenseRepository;
	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(BudgetTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		User user = new User();
		user.setEmail("example@example.com");
		user.setName("Bill");
		user.setPassword("password123");



		Category cat = new Category();
		cat.setName("Grocery");

		userRepository.save(user);
		categoryRepository.save(cat); // INSERT into database

		Expense expense = new Expense();
		expense.setDescription("Will probably change the tables later");
		expense.setExpenseDate(Instant.now());

		expenseRepository.save(expense);


		System.out.println("All categories in the database:");
		for (User printUser : userRepository.findAll()) {
			System.out.println(printUser);
		}
		for (Category category : categoryRepository.findAll()) {
			System.out.println(category);
		}
		for (Expense printExpense : expenseRepository.findAll()) {
			System.out.println(printExpense);
		}
	}
}
