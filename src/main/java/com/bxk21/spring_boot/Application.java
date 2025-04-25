package com.bxk21.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
	public String getUser(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@PostMapping("/login")
	public String login(
		@RequestParam(value = "userName", required = true) String userName,
		@RequestParam(value = "password", required = true) String password
	) {
		return String.format("Hello %s %s", userName, password);
	}

	@PatchMapping("/login")
	public String edit(
		@RequestParam(value = "userName", required = true) String userName,
		@RequestParam(value = "password", required = true) String password
	) {
		return String.format("Hello %s %s", userName, password);
	}

	// @PatchMapping("/login")
	// public String edit(
	// 	@RequestParam(value = "userName", required = true) String userName,
	// 	@RequestParam(value = "password", required = true) String password
	// ) {
	// 	return String.format("Hello %s %s", userName, password);
	// }

	// @PatchMapping("/login")
	// public String edit(
	// 	@RequestParam(value = "userName", required = true) String userName,
	// 	@RequestParam(value = "password", required = true) String password
	// ) {
	// 	return String.format("Hello %s %s", userName, password);
	// }
}
