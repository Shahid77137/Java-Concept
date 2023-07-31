package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.masai")
public class SpringSecurityDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDbApplication.class, args);
	}

}
