package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Formation;

@Repository
public interface FormationRepository  extends JpaRepository<Formation, Long > {

	@Query(value = "SELECT * FROM Formation  ORDER BY id" , nativeQuery = true)
	List<Formation> findAllFormation();
} 