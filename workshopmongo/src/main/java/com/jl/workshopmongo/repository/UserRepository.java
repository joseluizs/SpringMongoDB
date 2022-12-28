package com.jl.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jl.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
