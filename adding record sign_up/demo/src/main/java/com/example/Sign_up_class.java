package com.example;

import org.springframework.data.annotation.Id;


public class Sign_up_class {

    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String Address;
    public String phoneNumber;
    public String Email;
    public String password;
    

    public Sign_up_class() {}

    public Sign_up_class(String firstName, String lastName ,String add, String pn, String emailin, String pass)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = add;
        this.phoneNumber = pn;
        this.Email = emailin;
        this.password = pass;
    }
    public void setFirstName(String fnin)
    {
      firstName = fnin;
    }
    public void setlastName(String lnin)
    {
      lastName = lnin;
    }
    public void setAddress(String adin)
    {
      Address = adin;
    }
    public void setphoneNumber(String pnin)
    {
      phoneNumber = pnin;
    }
    public void setemail(String emin)
    {
      Email = emin;
    }
    public void setPassword(String passin)
    {
      password = passin;
    }
    public String getFname()
    {
    	return firstName;
    }
    public String getlname()
    {
    	return lastName;
    }
    public String getAddress()
    {
    	return Address;
    }
    public String getphoneNum()
    {
    	return phoneNumber;
    }
    public String getEmail()
    {
    	return Email;
    }
    public String getpassword()
    {
    	return password;
    }
   
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s', Address='%s', PhoneNumber='%s', Email='%s', password='%s']",
                id, firstName, lastName, Address, phoneNumber, Email, password);
    }

}
