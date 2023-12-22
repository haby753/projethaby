package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Salle;

public interface SalleService {
	Salle addSalle(Salle p);

	  void deleteSalle(Salle p);
	  
	   void deleteSalleById(Long id);
	   
	    Salle getSalleById(Long id);
	    List<Salle> getSalleAll();

		Salle updateSalle(Salle p);
}
