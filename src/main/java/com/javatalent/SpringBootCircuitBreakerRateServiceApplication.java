package com.javatalent;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatalent.entity.Rate;
import com.javatalent.repo.RateRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootCircuitBreakerRateServiceApplication {
	
	@Autowired
	   private RateRepository rateRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCircuitBreakerRateServiceApplication.class, args);
	}
	
	@PostConstruct
	   public void setupData() {
	      rateRepository.saveAll(Arrays.asList(
	         Rate.builder().id(1).type("PERSONAL").rateValue(10.0).build(),
	         Rate.builder().id(2).type("HOUSING").rateValue(8.0).build()
	      ));
	   }

}
