package SpringMongoDbExample.SpringMongoDbExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HouseApplication implements CommandLineRunner {

	@Autowired
	private HouseRepository repository1;

	public static void main(String[] args) {
		SpringApplication.run(HouseApplication.class, args);
	}

	public void run(String... args) throws Exception {

		repository1.deleteAll();
		
		repository1.save(new House("House", "Semi-Detached",5000,10,3,"22 Main Street, Letterkenny","Small",200000));
		repository1.save(new House("Appartment", "",5000,10,3,"22 Main Street, Letterkenny","Small",200000));

		// fetch all houses
		System.out.println("Houses found with findAll():");
		System.out.println("-------------------------------");
		for (House house : repository1.findAll()) {
			System.out.println(house);
		}
		System.out.println();
		
	}
}