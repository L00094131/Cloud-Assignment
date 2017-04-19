package com.example;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface property_Repository extends MongoRepository<property_class, String> {

    public Sign_up_class findByAddress4(String Address4);
    public List<property_class> findByAddress1(String Address1);

}

