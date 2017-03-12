package SpringMongoDbExample.SpringMongoDbExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplication implements CommandLineRunner {

	@Autowired
	private AdminRepository repository2;

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

	public void run(String... args) throws Exception {

		repository2.deleteAll();

		// save a couple of admins
		repository2.save(new Admin("Ryan Byrne","ryan@live.com","ryanb111"));
		repository2.save(new Admin("Eugene Robb","ER@hotmail.com","ER11")); 
		
		

		System.out.println("Admins found with findAll():");
		System.out.println("-------------------------------");
		for (Admin admin : repository2.findAll()) {
			System.out.println(admin);
		}
		System.out.println();
		
		
	}
}