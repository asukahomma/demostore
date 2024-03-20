package com.demostore.asuka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.demostore.asuka.entity")
@EnableJpaRepositories("com.demostore.asuka.repository")
public class AsukaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsukaApplication.class, args);
	}

}
