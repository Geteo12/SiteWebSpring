package com.JeeMavenSpringSiteWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.JeeMavenSpringSiteWeb.controllers"))
public class JeeMavenSpringSiteWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeeMavenSpringSiteWebApplication.class, args);
	}

}
