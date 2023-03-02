package com.fatecapi.moneymind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoneymindApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneymindApplication.class, args);
		
		System.out.println("\n");
		System.out.println("===================================================================================================================\n");
		System.out.println("Aplicação inicializada na porta 8080\n");
		System.out.println("===================================================================================================================\n");
	}

}
