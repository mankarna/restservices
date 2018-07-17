package com.javasampleapproach.jpapostgresqlangular4.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.jpapostgresqlangular4.model.Token;

public interface TokenRepository extends CrudRepository<Token, Long>{

	List<Token> findByIssuingStation(String issuingStation);
}
