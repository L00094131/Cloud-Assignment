package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Property_Application implements CommandLineRunner {

	@Autowired
	private property_Repository repository;
	Scanner KeyIn = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(Property_Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       // Customer sign = new Customer();
		repository.deleteAll();
 
		repository.save(new property_class("12 walnut grove", "Ramelton rd", "letterkenny", "Donegal","H12 F342", "for sale","bungalo house test", "toilet, sink,shower, kitchen","A+","500,000"));
		//repository.save(new Sign_up_class("molly", "reilly", "cavan", "0871212354","ertertefg@gmail.com", "bbb"));
		System.out.println("Done");

	}
}
