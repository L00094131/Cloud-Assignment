package hello;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public @Bean MongoClientFactoryBean mongo() throws UnknownHostException{
    	MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("localhost");
        return mongo;
   }
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith", 46));
		repository.save(new Customer("Bob", "Smith", 27));
		repository.save(new Customer("Jeremy", "Irons", 27));
		repository.save(new Customer("Bob", "Bradley", 36));
		repository.save(new Customer("Declan", "O Neil", 27));
		repository.save(new Customer("Agnes", "Bedingfield", 81));
		repository.save(new Customer("Donald", "Trump", 79));
		

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Bob'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByFirstName("Bob")){
				System.out.println(customer);
		}
		
		System.out.println();

		System.out.println("Customers found with findByLastName('Trump'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByLastName("Trump")) {
			System.out.println(customer);
		}
		
		/*System.out.println("Customers found by age('27')");
		System.out.println("---------------------------------");
		for (Customer customer : repository.findAge(27)){
			System.out.println(customer);
		}*/
		}
	}