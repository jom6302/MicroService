package com.destinyscrew.microservice.repository;

import com.destinyscrew.microservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
