package com.dehong.sso.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dehong.sso")
public class SsoBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoBootApplication.class, args);
	}
}
