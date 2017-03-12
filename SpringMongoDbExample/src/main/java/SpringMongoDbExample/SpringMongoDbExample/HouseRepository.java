package SpringMongoDbExample.SpringMongoDbExample;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HouseRepository extends MongoRepository<House, String> {

	//public House findBySize(int squareFeet);
    //public List<House> findByLastName(String lastName);
    //public Admin findByPhoneNumber(String phoneNumber);

}