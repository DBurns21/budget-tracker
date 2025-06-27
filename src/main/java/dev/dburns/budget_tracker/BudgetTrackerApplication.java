package dev.dburns.budget_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class BudgetTrackerApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(BudgetTrackerApplication.class, args);


	}
}
