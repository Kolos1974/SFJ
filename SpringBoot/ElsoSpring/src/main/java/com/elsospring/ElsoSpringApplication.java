package com.elsospring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ComponentScan({"com.elsospring","com.spy"})
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
public class ElsoSpringApplication {

	
	/*
	@Bean
	public Person giveMeAPerson() {
		return new Person("Gyula", 20);
	}
	*/
	
	
	
	
	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(ElsoSpringApplication.class, args);
		
		
		System.out.println(ct.getBean("person"));
		
		/*
		String[] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);
		
		for(String name : beanArray) {
			System.out.println(name);
		}
		*/
		
		
			
	}

}
