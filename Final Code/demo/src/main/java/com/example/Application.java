package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private Sign_up_Repository repository;
	Scanner KeyIn = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       // Customer sign = new Customer();
		repository.deleteAll();
 
		repository.save(new Sign_up_class("Alice", "Smith", "letterkenny", "087123457","setdffgesr@gmail.com", "aaa"));

	}
    /* System.out.println("Enter first name: ");
    String fname = KeyIn.nextLine();
    System.out.println("Enter last name: ");
    String lname = KeyIn.nextLine();
    System.out.println("Enter address name: ");
    String add = KeyIn.nextLine();
    System.out.println("Enter phone number: ");
    String phoneNUM = KeyIn.nextLine();
    System.out.println("Enter Email: ");
    String em = KeyIn.nextLine();
    System.out.println("Enter password: ");
    String pass = KeyIn.nextLine();
    sign.setFirstName(fname);
    sign.setlastName(lname);
    sign.setAddress(add);
    sign.setphoneNumber(phoneNUM);
    sign.setemail(em);
    sign.setPassword(pass);*/
	// save a couple of customerssdsdf
}

