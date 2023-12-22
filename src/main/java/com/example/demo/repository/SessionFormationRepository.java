package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SessionFormation;

@Repository
public interface SessionFormationRepository  extends JpaRepository<SessionFormation, Long > {

	@Query(value = "SELECT * FROM SessionFormation  ORDER BY id" , nativeQuery = true)
	List<SessionFormation> findAllSessionFormation();
} 