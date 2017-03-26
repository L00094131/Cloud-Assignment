package Sign_up;

public class sign_up_class 
{
		   private int id=0;
	       private String first_name;
		   private String Surname;
		   private String phone_number;
		   private String e_mail;
		   private String password;
		   public void SetID(int idIN)
		   {
			   idIN++;
			   id = idIN;
		   }
		   public void setName(String fname)
		   {
		      this.first_name  = fname;
		   }
		   public void setSname(String sname)
		   {
		      this.Surname  = sname;
		   }
		   public void setPnum(String pnum)
		   {
		      this.phone_number  = pnum;
		   }
		   public void setEmail(String email)
		   {
		      this.e_mail  = email;
		   }
		   public void setPass(String pass)
		   {
		      this.password  = pass;
		   }
		   public void getfirstName()
		   {
		      System.out.println("Your first name : " + first_name );
		   }
		   public void getsurname()
		   {
		      System.out.println("Your surname : " + Surname );
		   }
		   public void getphoneNum()
		   {
		      System.out.println("Your phone number : " + phone_number);
		   }
		   public void getemail()
		   {
		      System.out.println("Your email : " + e_mail );
		   }
		   public void getpassword()
		   {
		      System.out.println("Your password : " + password );
		   }
		    @Override
		    public String toString() {
		        return String.format(
		                "Sign_up[id=%s, first_name='%s', Surname='%s' , phone_number='%s', e_mail='%s' , password='%s']",
		                id, first_name, Surname, phone_number, e_mail, password);
		    }
}
