package com.project.teamproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TeamprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamprojectApplication.class, args);
	}

}
