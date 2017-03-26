package Sign_up;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.net.UnknownHostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.MapFactoryBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoFactoryBean;

@SpringBootApplication
public class sign_up_test implements CommandLineRunner
{
	    public @Bean MongoFactoryBean mongo() throws UnknownHostException{
	    	MongoFactoryBean mongo = new MongoFactoryBean();
	        mongo.setHost("localhost");
	        return mongo;
	   
		private Sign_in_Repository repository;
		
	@Autowired
	public static void main(String args)
	{
			SpringApplication.run(sign_up_test.class, args);
		}

		@Override
		public void run(String args) throws Exception 
		{

			repository.deleteAll();


		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      sign_up_class obj =  (sign_up_class)context.getBean("sign_up_class");
		      Scanner keyIn = new Scanner(System.in);
		      System.out.println("Enter Name");
		      String fname = keyIn.nextLine();
		      obj.setName(fname);
		      
		      System.out.println("Enter surname");
		      String sname = keyIn.nextLine();
		      obj.setSname(sname);
		      
		      System.out.println("Enter phone number");
		      String phonename = keyIn.nextLine();
		      obj.setPnum(phonename);
		      
		      System.out.println("Enter email");
		      String email = keyIn.nextLine();
		      obj.setEmail(email);
		      
		      System.out.println("password");
		      String passw = keyIn.nextLine();
		      obj.setPass(passw);
		      
		      repository.save(new sign_up_class(fname, sname, phonename, email, passw));

			// fetch all customers
			System.out.println("Customers found with findAll():");
			System.out.println("-------------------------------");
			for (sign_up_class Sign_up : repository.findAll()) {
				System.out.println(obj);
			}
			
			/*System.out.println("Customers found by age('27')");
			System.out.println("---------------------------------");
			for (Customer customer : repository.findAge(27)){
				System.out.println(customer);
			}*/
			}
		}

		@Override
		public void run(String... arg0) throws Exception {
			// TODO Auto-generated method stub
			
		}

 /**  public static void main(String[] args) 
   {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      sign_up_class obj =  (sign_up_class)context.getBean("sign_up_class");
      Scanner keyIn = new Scanner(System.in);
      System.out.println("Enter Name");
      String fname = keyIn.nextLine();
      obj.setName(fname);
      
      System.out.println("Enter surname");
      String sname = keyIn.nextLine();
      obj.setSname(sname);
      
      System.out.println("Enter phone number");
      String phonename = keyIn.nextLine();
      obj.setPnum(phonename);
      
      System.out.println("Enter email");
      String email = keyIn.nextLine();
      obj.setEmail(email);
      
      System.out.println("password");
      String passw = keyIn.nextLine();
      obj.setPass(passw);
      
      obj.getfirstName();
      obj.getsurname();
      obj.getphoneNum();
      obj.getemail();
      obj.getpassword();
   }*/
}