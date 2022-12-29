package com.jl.workshopmongo.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.jl.workshopmongo.domain.Post;
import com.jl.workshopmongo.domain.User;
import com.jl.workshopmongo.dto.AuthorDTO;
import com.jl.workshopmongo.repository.PostRepository;
import com.jl.workshopmongo.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
	    userRepository.deleteAll();
	    postRepository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User cris = new User(null, "Cris", "cris@gmail.com");
		User luiz = new User(null, "Luiz", "luiz@gmail.com");
		User esther = new User(null, "Esther", "esther@gmail.com");
		userRepository.saveAll(Arrays.asList(maria, alex, bob, cris, luiz, esther));
		
		Post p1 = new Post(null, LocalDate.parse("21/03/2018", fmt), "Partiu viagem", "Vou viajar pra São Paulo. Abraços!", new AuthorDTO(maria));
		Post p2 = new Post(null, LocalDate.parse("21/03/2018", fmt), "Bom dia", "Acordei feliz hj!", new AuthorDTO(maria));
		postRepository.saveAll(Arrays.asList(p1, p2));
		
		maria.getPosts().addAll(Arrays.asList(p1, p2));
		userRepository.save(maria);
	}

}
