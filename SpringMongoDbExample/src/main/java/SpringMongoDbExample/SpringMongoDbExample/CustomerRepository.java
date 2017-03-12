package SpringMongoDbExample.SpringMongoDbExample;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByname(String name);
    public Customer findByPhoneNumber(String phoneNumber);
    public List<Customer> deleteByname(String name);
    public Customer deleteCustomerByname(String name);

}