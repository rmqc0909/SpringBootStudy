package com.wisely;

import com.wisely.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch623Application {
	@Autowired
	private AuthorSettings authorSettings;
	public static void main(String[] args) {
		SpringApplication.run(Ch623Application.class, args);
	}

	@RequestMapping("/ch623")
	public String index() {
		return "The book author is : " + authorSettings.getName() + " and the author age is : " + authorSettings.getAge();
	}
}
