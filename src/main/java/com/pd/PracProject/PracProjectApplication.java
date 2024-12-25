package com.pd.PracProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.origin.SystemEnvironmentOrigin;

@SpringBootApplication
public class PracProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracProjectApplication.class, args);
		System.out.println("Hi pd here.."); 
	}

}
