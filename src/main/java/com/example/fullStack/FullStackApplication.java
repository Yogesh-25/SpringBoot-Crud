package com.example.fullStack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.fullStack")
@SpringBootApplication
public class FullStackApplication {

	public static void main(String[] args) {

		SpringApplication.run(FullStackApplication.class, args);
		System.out.println("Welcome to my fullstack website");
	}

}
