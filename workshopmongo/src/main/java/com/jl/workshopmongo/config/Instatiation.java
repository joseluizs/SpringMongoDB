package com.jl.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.jl.workshopmongo.domain.User;
import com.jl.workshopmongo.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User cris = new User(null, "Cris", "cris@gmail.com");
		User luiz = new User(null, "Luiz", "luiz@gmail.com");
		User esther = new User(null, "Esther", "esther@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob, cris, luiz, esther));
		
	}

}
