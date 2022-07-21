package com.example.refreshablesecretmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class RefreshableSecretManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefreshableSecretManagerApplication.class, args);
	}

}
