package SpringMongoDbExample.SpringMongoDbExample;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
	
	//public Admin findByname(String name);
    //public List<Admin> deleteByname(String name);
    //public Admin deleteCustomerByname(String name);

}
