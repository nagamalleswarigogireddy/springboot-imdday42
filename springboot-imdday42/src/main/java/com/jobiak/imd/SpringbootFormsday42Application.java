package com.jobiak.imd;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication
public class SpringbootFormsday42Application {

	
	
	public static void main(String[] args) {
		System.out.println("String Spring-boot....");
		SpringApplication.run(SpringbootFormsday42Application.class, args);
		System.out.println("Spring-boot started !");
	}

	

}
