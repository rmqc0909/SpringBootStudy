package com.wisely.ch5_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch52Application {
	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	public static void main(String[] args) {
		SpringApplication.run(Ch52Application.class, args);
	}
	@RequestMapping("/index")
	public String index() {
		return "The book author is : " + bookAuthor + "and book name is : " + bookName;
	}

}
