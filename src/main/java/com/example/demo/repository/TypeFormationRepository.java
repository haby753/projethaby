package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TypeFormation;


@Repository
public interface TypeFormationRepository  extends JpaRepository<TypeFormation, Long > {
	
	@Query(value = "SELECT * FROM TypeFormation ORDER BY id" , nativeQuery = true)
	List<TypeFormation> findAllTypeFormation();

} 