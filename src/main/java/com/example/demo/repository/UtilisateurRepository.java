package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Utilisateur;

@Repository
public interface UtilisateurRepository  extends JpaRepository<Utilisateur , Long > {

	@Query(value = "SELECT * FROM utilisateur  ORDER BY id" , nativeQuery = true)
	List<Utilisateur> findAllUser();
	
} 
