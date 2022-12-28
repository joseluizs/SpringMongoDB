package com.jl.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jl.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User cris = new User("1", "Cris Marques", "cris@gmail.com");
		User luiz = new User("2", "Luiz Marques", "luiz@gmail.com");
		List<User> list =  new ArrayList<>();
		list.addAll(Arrays.asList(cris, luiz));
		return ResponseEntity.ok().body(list);
	}

}
