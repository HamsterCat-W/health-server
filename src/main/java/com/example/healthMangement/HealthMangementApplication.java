package com.example.healthMangement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HealthMangementApplication implements CommandLineRunner {

	private Logger logger= LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(HealthMangementApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{

	}
}
