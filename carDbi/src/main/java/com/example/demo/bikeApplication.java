package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition
(info =@Info(
title = "Bike details",
version = "1.1.2",
description = "Bikedetails Project",
contact = @Contact(
		name = "omprakash",
		email = "omprakaxh@gmail.com"
		)
)
)
@SpringBootApplication

public class bikeApplication {
	public static void main(String[] args) {
		SpringApplication.run(bikeApplication.class, args);
	}

}
