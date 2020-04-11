package com.example.springThymeleafPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("springThymeleafPro.repo")
@EntityScan("springThymeleafPro.model")
@SpringBootApplication
public class SpringThymeleafProApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafProApplication.class, args);
	}

}
