package com.javasampleapproach.jpapostgresqlangular4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jpapostgresqlangular4.model.Token;
import com.javasampleapproach.jpapostgresqlangular4.repo.TokenRepository;
@RestController
public class TokenController {
	@Autowired
	TokenRepository repository;

	@GetMapping(value="/token",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Token> getAll() {
		List<Token> list = new ArrayList<>();
		Iterable<Token> token = repository.findAll();

		token.forEach(list::add);
		return list;
	}
	
	@PostMapping(value="/posttoken")
	public Token postToken(@RequestBody Token token) {

		repository.save(new Token(token.getTokenId(),token.getIssuingZone(), token.getIssuingStation()));
		return token;
	}

	@GetMapping(value="/findbyissuingStation/{issuingStation}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Token> findByfindByIssuingStation(@PathVariable String issuingStation) {

		List<Token> token = repository.findByIssuingStation(issuingStation);
		return token;
	}
	
	@DeleteMapping(value="/token/{id}")
	public void deleteToken(@PathVariable long id){
		
		repository.delete(id);
	}

}
