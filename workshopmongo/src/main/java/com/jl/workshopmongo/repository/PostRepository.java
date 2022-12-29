package com.jl.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jl.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
