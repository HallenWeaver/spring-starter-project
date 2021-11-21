package com.alribeirom.armjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ArmJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArmJavaApplication.class, args);
	}

}
