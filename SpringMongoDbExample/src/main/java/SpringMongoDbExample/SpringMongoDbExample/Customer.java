package SpringMongoDbExample.SpringMongoDbExample;

import org.springframework.data.annotation.Id;


public class Customer extends Person{

    @Id
    public String id;
    public String phoneNumber;
    public boolean subscription;
    //public house housesForSale;
    

    public Customer() {}

    public Customer(String name, String phoneNumber, String emailAddress, String password) {
        this.name = name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.password=password;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', phoneNumber='%s', emailAddress='%s']",
                id, name, phoneNumber, emailAddress);
    }

}