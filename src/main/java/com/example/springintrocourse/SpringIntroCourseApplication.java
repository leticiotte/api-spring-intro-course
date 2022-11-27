package com.example.springintrocourse;

import com.example.springintrocourse.domain.User;
import com.example.springintrocourse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringIntroCourseApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroCourseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Letícia", "leticiotte", "senha123");
		User user2 = new User(null, "Danúbia", "daneg", "senha123");

		userRepository.saveAll(Arrays.asList(user1, user2));
	}
}
