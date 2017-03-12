package SpringMongoDbExample.SpringMongoDbExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Ryan Byrne","0749112345","ryanb@hotmail.com","ryanb111"));
		repository.save(new Customer("Eugene Robb","0749554321","eugeneR@hotmail.com","ER11"));
		repository.save(new Customer("Stephen Curran","0749121231","StephenCurran@live.com","SC111"));
		repository.save(new Customer("Matthew McColgan","0749143216","MathenMcColgan@outlook.com","MMC111"));
		repository.save(new Customer("James Byrne","0749188753","jb@live.ie","JB111"));
		repository.save(new Customer("Jim Boyle","0749187153","jimB@hotmail.com","JB112"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();


		// fetch an individual customer
		System.out.println("Customer found with name('Jim Boyle'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByname("Jim Boyle"));
		System.out.println("");

		System.out.println("Customer found with name('Ryan Byrne'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByname("Ryan Byrne"));
		System.out.println("");

		// fetch all customers
		System.out.println("Customers found with deleteByname('Ryan Byrne):");
		System.out.println("-------------------------------");
		for (Customer customer : repository.deleteByname("Ryan Byrne")) {
			System.out.println(customer);
		}
		System.out.println();

		System.out.println("Customer found with name('Ryan Byrne'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByname("Ryan Byrne"));
		System.out.println("");


		System.out.println("Customer found with findByPhoneNumber('0749112345'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByPhoneNumber("0749112345"));
		System.out.println("");

	}

}