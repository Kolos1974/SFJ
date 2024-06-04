package com.elsospring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.elsospring","com.spy"})
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
public class ElsoSpringApplication {

	
	@Bean
	public Person giveMeAPerson() {
		return new Person("Gyula", 20);
	}
	
	
	
	
	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(ElsoSpringApplication.class, args);
		
		String[] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);
		
		for(String name : beanArray) {
			System.out.println(name);
		}
		
		
			
	}

}
