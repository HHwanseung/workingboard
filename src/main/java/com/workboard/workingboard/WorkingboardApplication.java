package com.workboard.workingboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.EntityListeners;

@SpringBootApplication
@EnableJpaAuditing
public class WorkingboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkingboardApplication.class, args);
	}

}
