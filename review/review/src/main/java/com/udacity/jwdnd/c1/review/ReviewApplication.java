package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message(){
		System.out.println("main class message bean: ");
		return "Hello, Spring";
	}

	@Bean
	public String upperCaseMessage(MessageService messageService){
		System.out.println("main class upperCaseMessage bean");
		return messageService.upperCase();
	}

	@Bean
	public String lowerCaseMessage(MessageService messageService){
		System.out.println("main class lowerCaseMessage bean");
		return messageService.lowerCase();
	}


}
