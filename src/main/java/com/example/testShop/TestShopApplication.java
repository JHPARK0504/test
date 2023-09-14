package com.example.testShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TestShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestShopApplication.class, args);
	}

}
