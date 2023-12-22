package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Salle;

@Repository
public interface SalleRepository  extends JpaRepository<Salle, Long > {

	@Query(value = "SELECT * FROM Salle  ORDER BY id" , nativeQuery = true)
	List<Salle> findAllSalle();
} 