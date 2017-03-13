package Sign_up;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sign_up_test
{
   public static void main(String[] args) 
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
   }
}