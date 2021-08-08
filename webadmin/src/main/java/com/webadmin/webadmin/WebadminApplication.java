package com.webadmin.webadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;

import com.webadmin.webadmin.dao.UserRepository;

@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@SpringBootApplication
public class WebadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebadminApplication.class, args);
	}

}
