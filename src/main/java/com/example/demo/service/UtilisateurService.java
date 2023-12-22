package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Utilisateur;

public interface UtilisateurService {
	Utilisateur addUtilisateur(Utilisateur p);

	  void deleteUtilisateur(Utilisateur p);
	  
	   void deleteUtilisateurById(Long id);
	   
	    Utilisateur getUtilisateurById(Long id);
	    
	    List<Utilisateur> getUtilisateurAll();

		Utilisateur updateUtilisateur(Utilisateur p);

}
