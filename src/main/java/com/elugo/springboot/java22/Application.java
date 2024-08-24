package com.elugo.springboot.java22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("Initiazing the application");
		SpringApplication.run(Application.class, args);
	}

}