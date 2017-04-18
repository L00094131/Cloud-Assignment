package com.example;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Sign_up_Repository extends MongoRepository<Sign_up_class, String> {

    public Sign_up_class findByFirstName(String firstName);
    public List<Sign_up_class> findByLastName(String lastName);

}