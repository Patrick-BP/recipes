package com.patrick.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipesApplication {

	public static void main(String[] args) {
		System.out.println("===Start===");
		SpringApplication.run(RecipesApplication.class, args);
		System.out.println("===End===");
	}

}
