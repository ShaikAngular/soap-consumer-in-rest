package com.consumesoapserviceinrest.consumesoapserviceinrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumeSoapServiceInRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeSoapServiceInRestApplication.class, args);
		System.out.println("Consuming SOAP service in REST");
	}
	
}
