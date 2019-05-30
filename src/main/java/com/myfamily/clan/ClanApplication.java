package com.myfamily.clan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClanApplication.class, args);
		System.out.println("In ClanApplication main class...");
	}

}
