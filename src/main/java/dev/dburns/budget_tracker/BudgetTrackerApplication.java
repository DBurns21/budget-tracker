package dev.dburns.budget_tracker;

import dev.dburns.budget_tracker.model.Category;
import dev.dburns.budget_tracker.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class BudgetTrackerApplication implements  CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;


	public static void main(String[] args) {
		SpringApplication.run(BudgetTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Category cat = new Category();
		cat.setName("Grocery");

		categoryRepository.save(cat); // INSERT into database

		System.out.println("All categories in the database:");
		for (Category category : categoryRepository.findAll()) {
			System.out.println(category);
		}
	}
}
