package com.alltr.learnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyLearningsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyLearningsApplication.class, args);
		String version = System.getProperty("java.version");
		System.out.println("TEST SPRING BOOT :>"+version);
	}

}
