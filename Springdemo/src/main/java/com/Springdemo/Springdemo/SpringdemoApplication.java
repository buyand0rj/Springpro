package com.Springdemo.Springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;

@SpringBootApplication
public class   SpringdemoApplication {

	public static void main(String[] args) {
		System.console().printf("started");
		SpringApplication.run(SpringdemoApplication.class, args);
		System.console().printf("ended");
	}

}
