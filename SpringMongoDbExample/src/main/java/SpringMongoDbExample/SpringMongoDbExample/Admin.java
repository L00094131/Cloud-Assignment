package SpringMongoDbExample.SpringMongoDbExample;

import org.springframework.data.annotation.Id;


public class Admin extends Person{

    @Id
    public String id;
    //public house housesForSale;
    

    public Admin() {}

    public Admin(String name, String emailAddress, String password) {
        this.name = name;
        this.emailAddress=emailAddress;
        this.password=password;
    }

    @Override
    public String toString() {
        return String.format(
                "Admin[id=%s, name='%s', emailAddress='%s']",
                id, name, emailAddress);
    }

}