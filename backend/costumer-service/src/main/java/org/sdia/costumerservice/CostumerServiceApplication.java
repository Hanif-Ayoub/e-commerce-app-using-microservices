package org.sdia.costumerservice;

import org.sdia.costumerservice.entities.Costumer;
import org.sdia.costumerservice.repository.CostumerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CostumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CostumerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Costumer.builder().name("ali").email("ali@gmail.com").build(),
					Costumer.builder().name("anas").email("anas@gmail.com").build(),
					Costumer.builder().name("anis").email("anis@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
